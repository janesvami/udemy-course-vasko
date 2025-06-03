package OOP.src.com.javalesson.oop.oop;

public class Dog {

    private static int dogsCount = 0;
    public static final int PAWS = 4;
    public static final int TAIL = 1;
    private String name;
    private String breed;
    private Size size = Size.UNDEFINED;

    public Dog() {
        dogsCount++;
        System.out.println("Dogs count " + dogsCount);
    }

    public static int getDogsCount() {
        return dogsCount;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
    this.size = size;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void bark() {

        switch (size){
            case BIG, VERY_BIG -> System.out.println("Wof-Wof!");
            case AVERAGE -> System.out.println("Raf-raf!");
            case SMALL, VERY_SMALL -> System.out.println("Tiaf-tiaf");
            default -> System.out.println("Not a size");

        }

    }

    public void bite() {
        if (dogsCount > 2) {
            System.out.println("Dogs are biting you");
        } else {
            bark();
        }

    }
}

