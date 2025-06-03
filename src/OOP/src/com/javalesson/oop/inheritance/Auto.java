package OOP.src.com.javalesson.oop.inheritance;

public abstract class Auto {

    private String producer = "Mercedes";
    private String model = "A180";
    private Engine engine;
    private int currentSpeed;
    protected boolean isRunning;



    public Engine getEngine() {
        return engine;
    }

    public Auto(String producer, String model, Engine engine) {
        this.producer = producer;
        this.model = model;
        this.engine = engine;
        System.out.println("Auto was initialized");
    }
    public abstract void energize();
    public void start() {
        isRunning = true;
        currentSpeed = 10;
        System.out.println("Auto is starting");
    }

    public void stop() {
        isRunning = false;
        currentSpeed = 0;
        System.out.println("Auto is stopped");
    }

    public void accelerate(int kmPerHour) {
        currentSpeed += kmPerHour;
        System.out.println("Accelerating. Current speed is " + currentSpeed + " kmPerHour");
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }



}
