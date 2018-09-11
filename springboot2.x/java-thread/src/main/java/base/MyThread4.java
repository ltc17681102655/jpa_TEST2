package base;

public class MyThread4 extends Thread {

    private Integer count = 5;


    @Override
    public synchronized void run() {
        super.run();
        count--;
        if (Thread.currentThread().getName().equals("c")) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("线程名 == " + Thread.currentThread().getName() + " == " + count);
    }
}
