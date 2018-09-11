package base;

import org.junit.jupiter.api.Test;

public class TestThread2 {

    public static void main(String[] args) throws InterruptedException {
        MyThread5 myThread = new MyThread5();
        myThread.start();
//        myThread.sleep(1000);
//        myThread.interrupt();
    }

    @Test
    public void demo(){
        System.out.println(Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(6);

        System.out.println(Thread.currentThread().getPriority());

        //线程优先级具有继承特性测试代码：
        MyThread6 myThread6 = new MyThread6();
        myThread6.start();

        /**
         * 5
         * 6
         * 6
         */

    }

    @Test
    public void demo2(){
        MyThread6 myThread6 = new MyThread6();
        myThread6.start();

        //5
    }

    @Test
    public void demo3(){
        MyThread6 myThread6 = new MyThread6();
        myThread6.setDaemon(true);
        myThread6.start();
        boolean alive = myThread6.isAlive();
        System.out.println(alive);
        boolean daemon = myThread6.isDaemon();
        System.out.println(daemon);

        /**
         * true
         * true
         * 5
         */

        //5
    }

    @Test
    public void demo4(){
        MyThread6 myThread6 = new MyThread6();
//        myThread6.setDaemon(true);
        myThread6.start();
        myThread6.interrupt();
//        myThread6.stop();
        boolean alive = myThread6.isAlive();
        System.out.println(alive);
        boolean daemon = myThread6.isDaemon();
        System.out.println(daemon);

        /**
         * true
         * true
         * 5
         */

        //5
    }



}
