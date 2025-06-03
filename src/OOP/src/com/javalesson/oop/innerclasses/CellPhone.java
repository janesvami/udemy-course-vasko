package OOP.src.com.javalesson.oop.innerclasses;

public class CellPhone {
    private String make;
    private String model;
    private Display display;
    private RadioModule gsm;
    private AbstractButton button;

    public interface AbstractButton {
        void click();
    }

    public CellPhone(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void turnOn() {
        initDisplay();
        gsm = new RadioModule();
        initButton();
    }

    public void initButton(){
        button = () -> System.out.println("Button clicked");
    }

    private void initDisplay() {
        display = new Display();
    }

    public void call(String number) {
        button.click();
        gsm.call(number);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Display getDisplay() {
        return display;
    }
}
