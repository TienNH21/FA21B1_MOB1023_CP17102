package lesson12_threading;

public class MainClass {
    public static void main(String[] args) {
//        MyThread t1 = new MyThread("Đây là thread 1"),
//            t2 = new MyThread("Đây là thread 2");
        
        // C2: Tạo thread từ Runnable
        MyRunnable r1 = new MyRunnable();
        MyRunnable r2 = new MyRunnable();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        System.out.println("Alive: " + t1.isAlive());
        System.out.println("Id: " + t1.getId());
        System.out.println("Name: " + t1.getName());
        System.out.println("Priority: " + t1.getPriority());
        t2.start();
    }
}
