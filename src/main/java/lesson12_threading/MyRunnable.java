package lesson12_threading;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Đây là 1 thread");
    }
}
