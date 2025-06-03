package egor.oop;

import java.time.Year;

public abstract class Animal {

    private String name;
    private boolean isThereATail;
    private Nutrition nutrition;
    private int lifeExpectancy;
    private HumanInteraction humanInteraction;
    private int yearOfBirth;
    private LifeStage lifeStage;
    private Mood mood = Mood.NEUTRAL;

    public Animal(String name, boolean isThereATail, Nutrition nutrition, int lifeExpectancy,
                  HumanInteraction humanInteraction, int yearOfBirth, LifeStage lifeStage) {
        this.name = name;
        this.isThereATail = isThereATail;
        this.nutrition = nutrition;
        this.lifeExpectancy = lifeExpectancy;
        this.humanInteraction = humanInteraction;
        this.yearOfBirth = yearOfBirth;
        this.lifeStage = lifeStage;
    }

    public void setLifeStage(LifeStage lifeStage) {
        this.lifeStage = lifeStage;
    }

    protected int currentYear = Year.now().getValue();

    protected String getName() {
        return name;
    }

    protected LifeStage getLifeStage() {
        return lifeStage;
    }

    protected Mood getMood() {
        return mood;
    }

    public void beBorn() {
        System.out.println("A new animal was born!");
    }

    public void eat() {
        switch (nutrition) {
            case HERBIVOROUS -> System.out.println(getName() + " is eating grass");
            case CARNIVOROUS -> System.out.println(getName() + " is eating another animal");
            case OMNIVOROUS -> System.out.println(getName() + " is eating everything");
            case PARASITES -> System.out.println(getName() + " is secretly eating another animal");
            default -> System.out.println("We don't know what this animal eats");
        }
    }

    public void die() {
        int numberOfYears = currentYear - yearOfBirth;
        if (numberOfYears > lifeExpectancy) {
            System.out.println("Unfortunately, " + getName() + " is dead. We are very sorry");
        } else {
            System.out.println("This animal is too young to die");
        }
    }

}
