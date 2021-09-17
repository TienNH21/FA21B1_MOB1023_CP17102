package lesson2_interface;

public class Bird extends Animal implements Flyable {
    @Override
    public void fly() {
        System.out.println("Flying ...");
    }

    @Override
    public void tiengKeu() {
        System.out.println("ABC ...");
    }
}
