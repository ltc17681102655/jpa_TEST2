package base;

public class MyThread5 extends Thread {

    private Integer count = 5;


    @Override
    public synchronized void run() {
        super.run();

        while (count > 0) {
            count--;

            if (this.isInterrupted()) {
                System.out.println("线程名 == " + Thread.currentThread().getName() + " == " + count);
                return;
            }
            System.out.println("线程名 == " + Thread.currentThread().getName() + " == " + count);
        }

        System.out.println("退出了");

    }
}
