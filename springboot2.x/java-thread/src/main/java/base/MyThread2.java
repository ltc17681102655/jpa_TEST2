package base;

public class MyThread2 extends Thread {

    private Integer count = 5 ;


    @Override
    public void run() {
        super.run();
        count--;
        System.out.println("线程名 == "+ Thread.currentThread().getName()+" == " + count);
    }
}
