package lesson12_threading;

public class MyThread extends Thread {
    private String message;
    
    public MyThread(String message) {
        this.message = message;
    }
    
    @Override
    public void run() {
        System.out.println(this.message);
    }
}
