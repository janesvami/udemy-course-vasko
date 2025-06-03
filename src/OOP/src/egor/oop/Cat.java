package OOP.src.egor.oop;


import java.util.Arrays;
import java.util.stream.Collectors;

public class Cat extends Mammal<Cat> {
    public static int getNumberOfCats() {
        return numberOfCats;
    }

    private String breeds;
    private String color;
    private boolean isSterilized;
    private boolean isPlayful;
    private boolean isShy;
    private boolean isGentle;
    private boolean isKind;
    private boolean isNaughty;
    private boolean isClosed;
    private boolean isAggressive;
    private boolean isSmart;
    private boolean isLazy;
    public static int numberOfCats = 0;

    public boolean isPlayful() {
        return isPlayful;
    }

    public boolean isShy() {
        return isShy;
    }

    public boolean isGentle() {
        return isGentle;
    }

    public boolean isKind() {
        return isKind;
    }

    public boolean isNaughty() {
        return isNaughty;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public boolean isAggressive() {
        return isAggressive;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public boolean isLazy() {
        return isLazy;
    }

    public Cat(String name, int yearOfBirth, LifeStage lifeStage, TailLength tailLength,
               WoolLength woolLength, Sex sex, String breeds, String color,
               boolean isPlayful, boolean isShy, boolean isGentle, boolean isKind, boolean isNaughty,
               boolean isClosed, boolean isAggressive, boolean isSmart, boolean isLazy) {
        super(name, true, Nutrition.CARNIVOROUS, 20, HumanInteraction.FRIEND,
                yearOfBirth, lifeStage, 30, 4, tailLength, false,
                false, true, woolLength, sex, Lifestyle.GROUND);
        this.breeds = breeds;
        this.color = color;
        this.isSterilized = false;
        this.isPlayful = isPlayful;
        this.isShy = isShy;
        this.isGentle = isGentle;
        this.isKind = isKind;
        this.isNaughty = isNaughty;
        this.isClosed = isClosed;
        this.isAggressive = isAggressive;
        this.isSmart = isSmart;
        this.isLazy = isLazy;
        numberOfCats++;
    }

    protected String getBreeds() {
        return breeds;
    }

    public void hunt() {
        System.out.println(getName() + " is hunting! Rrrr");
    }

    public void play() {
        if (getMood() == Mood.GOOD) {
            System.out.println(getName() + " is playing");
        }
    }

    public void misbehave() {
        System.out.println(getName() + " dropped everything, Natasha, honestly");
    }

    public void caress() {
        if (getMood() == Mood.GOOD) {
            System.out.println("Pet " + getName() + ", please");
        }
    }

    public void purr() {
        if (getMood() == Mood.GOOD) {
            System.out.println(getName() + " is purring");
        }
    }

    public void mew() {
        if (getMood() == Mood.BAD) {
            System.out.println(getName() + " is meowing! Something wrong!");
        }
    }

    public void scratch() {
        if (getMood() == Mood.BAD) {
            System.out.println(getName() + " is scratching YOU! Aaaah!");
        }
    }

    public void bite() {
        if (getMood() == Mood.BAD) {
            System.out.println(getName() + " is biting YOU! Aaaah!");
        }
    }

    public void hiss() {
        if (getMood() == Mood.BAD) {
            System.out.println(getName() + " is hissing! Run!");
        }
    }

    protected void setSterilized(boolean sterilized) {
        isSterilized = sterilized;
    }

    @Override
    public String toString() {
        return "\n Новый котик: \n\n Кличка: " + getName() +
                "\n Возрастная группа: " + getLifeStage() +
                "\n Пол: " + getSex() +
                "\n Длина хвоста: " + getTailLength() +
                "\n Длина шерсти: " + getWoolLength() +
                "\n Порода: " + getBreeds() +
                "\n Окрас: " + color +
                "\n\n Характер: \n Игривость: " + isPlayful +
                "\n Застенчивость: " + isShy +
                "\n Нежность: " + isGentle +
                "\n Доброта: " + isKind +
                "\n Склонность к хулиганству " + isNaughty +
                "\n Замкнутость: " + isClosed +
                "\n Агрессивность: " + isAggressive +
                "\n Высокий уровень интеллекта: " + isSmart +
                "\n Склонность к лени: " + isLazy +
                " ";
    }

    @Override
    public Cat makeLoveWith(Cat crush) {
        String thisName = this.getName();
        if (this.equals(crush)) {
            throw new RuntimeException("EW! You, dirty " + thisName + "! Stop it!");
        } else if (this.getSex() == crush.getSex()) {
            throw new RuntimeException("We don't believe in same-sex love");
        } else if (this.getLifeStage() == LifeStage.BABY || crush.getLifeStage() == LifeStage.BABY) {
            throw new RuntimeException("There is a completely different kind of love for children");
        } else if (!this.isSterilized && !crush.isSterilized && flipACoin()) {


            int a = 1;
            int b = 1000000;
            int numberName = a + (int) (Math.random() * b);
            String name = Integer.toString(numberName);
            int yearOfBirth = currentYear;
            LifeStage lifeStage = LifeStage.BABY;
            TailLength tailLength = flipACoin() ? this.getTailLength() : crush.getTailLength();
            WoolLength woolLength = flipACoin() ? this.getWoolLength() : crush.getWoolLength();
            Sex sex = flipACoin() ? this.getSex() : crush.getSex();

            Cat papa = this.getSex() == Sex.MALE ? this : crush;
            Cat mama = this.getSex() == Sex.FEMALE ? this : crush;


            String breeds = Arrays.stream((this.breeds + ", " + crush.breeds).split(", "))
                    .distinct()
                    .collect(Collectors.joining(", "));

            String color = Arrays.stream((this.color + ", " + crush.color).split(", "))
                    .distinct()
                    .collect(Collectors.joining(", "));

            boolean isPlayful = flipACoin() ? this.isPlayful : crush.isPlayful;
            boolean isShy = flipACoin() ? this.isShy : crush.isShy;
            boolean isGentle = flipACoin() ? this.isGentle : crush.isGentle;
            boolean isKind = flipACoin() ? this.isKind : crush.isKind;
            boolean isNaughty = flipACoin() ? this.isNaughty : crush.isNaughty;
            boolean isClosed = flipACoin() ? this.isClosed : crush.isClosed;
            boolean isAggressive = flipACoin() ? this.isAggressive : crush.isAggressive;
            boolean isSmart = flipACoin() ? this.isSmart : crush.isSmart;
            boolean isLazy = flipACoin() ? this.isLazy : crush.isLazy;

            Cat baby = new Cat(name, yearOfBirth, lifeStage, tailLength, woolLength, sex, breeds,
                    color, isPlayful, isShy, isGentle, isKind, isNaughty, isClosed, isAggressive,
                    isSmart, isLazy);
            baby.setMama(mama);
            baby.setPapa(papa);
//            baby.beBorn();

            return baby;
        } else {
            return null;
        }
    }
}
