package lesson2_interface;

public class Cat extends Animal implements Runable {
    @Override
    public void run() {
        System.out.println("Running ...");
    }

    @Override
    public void tiengKeu() {
        System.out.println("Meow ...");
    }
}
