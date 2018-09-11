package practice;

public class MyThread1 implements Runnable {

    private Object prev;

    private Object self;

    public MyThread1(Object prev, Object self) {
        this.prev = prev;
        this.self = self;
    }

    @Override
    public void run() {
        int i = 10;
        for (int j = 0; j < i; j++) {
            synchronized (prev) {
                synchronized (self) {
                    System.out.print(Thread.currentThread().getName());
                    self.notify();
                }
                try {
                    prev.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
