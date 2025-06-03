package com.javacode.lambdas;

import java.util.Arrays;
import java.util.Comparator;

public class LambdasMain {
    public static void main(String[] args) {

        String[] colours = {"green", "brown", "black", "pink", "grey"};

        Player player1 = new Player("Alex", 100);
        Player player2 = new Player("Igor", 80);
        Player player3 = new Player("Victor", 80);
        Player player4 = new Player("John", 91);

        Player[] players = {player1, player2, player3, player4};

        Arrays.sort(players, (p1, p2) -> {
                    if ((p2.score - p1.score) != 0) {
                        return p2.score - p1.score;
                    } else {
                        return p1.name.compareTo(p2.name);
                    }
                }
        );


        System.out.println(Arrays.toString(players));

        Arrays.sort(colours, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(o1.length() - 1) - o2.charAt(o2.length() - 2);
            }
        });

        System.out.println(Arrays.toString(colours));

        Arrays.sort(colours, (String o1, String o2) -> o1.charAt(o1.length() - 1) - o2.charAt(o2.length() - 2));

    }


    private static class Player {
        private String name;
        private int score;

        public Player(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        @Override
        public String toString() {
            return "\n" + name + " " + score;
        }
    }
}
