package practice;

public class MyThread2 extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println(Thread.currentThread().getName());
    }
}
