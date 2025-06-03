package com.javacode.collections.egor.openMap;

public class NewMap {
    int[] keys = new int[16];
    long[] values = new long[16];
    int size = 0;
    double loadFactor = 0.5;
    int capacity = keys.length;


    public void put (int key, long value) {
        int firstIndex = key % keys.length;
        int walkingDeadIndex = firstIndex;
        int quadraticSearchCounter = 1;
        int finalIndex = firstIndex;
        int threshold = (int) (capacity * loadFactor);


        if (key == 0) {
            values[0] = value;
            size++;
        } else {
            while (finalIndex == 0 || keys[finalIndex] != 0) {
                for (int i = walkingDeadIndex; i < keys.length; i++) {
                    finalIndex = walkingDeadIndex + quadraticSearchCounter;
                    quadraticSearchCounter = quadraticSearchCounter * 2;

                    if (finalIndex >= keys.length || keys[finalIndex] == 0) {
                        break;
                    }
                }
                walkingDeadIndex++;
                if (walkingDeadIndex >= keys.length) {
                    walkingDeadIndex = 1;
                } else if (walkingDeadIndex == firstIndex) {
                    throw new RuntimeException("Place for key " + key + " is not found");
                }
                finalIndex = walkingDeadIndex;
            }

            keys[finalIndex] = key;
            values[finalIndex] = value;
            size++;

            if (size >= threshold) {
                int[] newKeys = new int[keys.length * 2];

                for (int transferredKey : keys) {
                    this.keys = newKeys;
                    put(transferredKey, value);
                }

                keys = newKeys;
            }

        }
    }
}

