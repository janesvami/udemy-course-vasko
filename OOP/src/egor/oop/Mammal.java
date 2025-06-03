package egor.oop;

public abstract class Mammal<S extends Mammal<S>> extends Animal {
    private int numberOfThees;
    private int numberOfCubs;
    private TailLength tailLength;
    private boolean hasHorns;
    private boolean hasHooves;
    private boolean hasClaws;
    private WoolLength woolLength;
    private Sex sex;
    private Lifestyle lifestyle;
    private Mammal mama;
    private Mammal papa;

    protected void setMama(Mammal mama) {
        this.mama = mama;
    }

    protected void setPapa(Mammal papa) {
        this.papa = papa;
    }

    public Mammal(String name, boolean isThereATail, Nutrition nutrition, int lifeExpectancy,
                  HumanInteraction humanInteraction, int yearOfBirth, LifeStage lifeStage,
                  int numberOfThees, int numberOfCubs, TailLength tailLength, boolean hasHorns,
                  boolean hasHooves, boolean hasClaws, WoolLength woolLength, Sex sex, Lifestyle lifestyle) {
        super(name, isThereATail, nutrition, lifeExpectancy, humanInteraction, yearOfBirth, lifeStage);
        this.numberOfThees = numberOfThees;
        this.numberOfCubs = numberOfCubs;
        this.tailLength = tailLength;
        this.hasHorns = hasHorns;
        this.hasHooves = hasHooves;
        this.hasClaws = hasClaws;
        this.woolLength = woolLength;
        this.sex = sex;
        this.lifestyle = lifestyle;
    }

    protected Sex getSex() {
        return sex;
    }

    protected TailLength getTailLength() {
        return tailLength;
    }

    protected WoolLength getWoolLength() {
        return woolLength;
    }

    public abstract S makeLoveWith(S crush);

    protected boolean flipACoin() {
        int minValue = 1;
        int maxValue = 10;
        int randomNumber = minValue + (int) (Math.random() * maxValue);
        return switch (randomNumber) {
            case 1, 2, 3, 4, 5 -> false;
            case 6, 7, 8, 9, 10 -> true;
            default -> throw new IllegalStateException("Unexpected value: " + randomNumber);
        };
    }

    public boolean isSameSex(Mammal mammal) {
        return this.getSex() == mammal.getSex();
    }

    public boolean isBaby() {
        return this.getLifeStage() == LifeStage.BABY;
    }

    public boolean isParent(Mammal mammal) {
        return this.mama == mammal || this.papa == mammal;
    }

    public static boolean isLovePossible(Mammal mama, Mammal papa) {
        return !papa.equals(mama) && !papa.isSameSex(mama) && !mama.isBaby() && !papa.isBaby() &&
                !papa.isParent(mama) && !mama.isParent(papa);
    }

}


