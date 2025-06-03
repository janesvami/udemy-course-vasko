package OOP.src.com.javalesson.oop.interfaces;

import java.util.PrimitiveIterator;

public class InterfaceRunner {
    public static void main(String[] args) {

        Pricable pizza = new Pizza("Neapolitano", 1, 20, Size.M);
        Pricable phone = new CellPhone("Motorola", "XT1575", 1, 250);
        Pricable fridge = new Fridge("LG", "E9090", 1, 300);

        printDeliverable(pizza);
        printDeliverable(phone);
        printDeliverable(fridge);

            }

            private static void printDeliverable(Pricable del) {
                System.out.println("Delivery price " + del.calcDeliveryPrice());
                System.out.println("Order price " + del.calcOrderPrice());
            }
}
