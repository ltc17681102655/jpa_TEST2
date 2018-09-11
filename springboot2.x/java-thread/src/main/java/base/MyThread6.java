package base;

public class MyThread6 extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println(Thread.currentThread().getPriority());
    }

    @Override
    public void finalize() {
        System.out.println("垃圾被清扫了");
    }
}
