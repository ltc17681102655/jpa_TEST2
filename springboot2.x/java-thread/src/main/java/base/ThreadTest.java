package base;

import org.junit.jupiter.api.Test;

public class ThreadTest {

    public static void main(String[] args) {
        MyThread myThread = new MyThread("A");
        MyThread myThread2 = new MyThread("B");
        MyThread myThread3 = new MyThread("C");
        myThread.start();
        myThread2.start();
        myThread3.start();
        System.out.println("====线程执行====");
        /**
         * 线程执行
         * MyThread
         */
    }

    @Test
    public void testRunable() {

        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("线程执行");

        /**
         * Runnable
         * 线程执行
         */
    }

    @Test
    /**
     * 共享数据的情况
     */
    public void testThread() {

        MyThread2 myThread = new MyThread2();
        Thread a = new Thread(myThread, "a");
        Thread b = new Thread(myThread, "b");
        Thread c = new Thread(myThread, "c");
        Thread d = new Thread(myThread, "d");
        Thread e = new Thread(myThread, "e");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();

        /**
         * 线程名 == a == 3
         * 线程名 == d == 2
         * 线程名 == b == 3
         * 线程名 == c == 1
         * 线程名 == e == 0
         */
    }

    @Test
    /**
     * 共享数据的情况
     */
    public void testThread2() {

        MyThread3 myThread = new MyThread3();
        Thread a = new Thread(myThread, "a");
        Thread b = new Thread(myThread, "b");
        Thread c = new Thread(myThread, "c");
        Thread d = new Thread(myThread, "d");
        Thread e = new Thread(myThread, "e");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();

        /**
         *         线程名 == a == 4
         *         线程名 == b == 3
         *         线程名 == c == 2
         *         线程名 == d == 1
         *         线程名 == e == 0
         */
    }

    @Test
    public void demo(){

        MyThread4 myThread = new MyThread4();
        Thread a = new Thread(myThread, "a");
        Thread b = new Thread(myThread, "b");
        Thread c = new Thread(myThread, "c");
        Thread d = new Thread(myThread, "d");
        Thread e = new Thread(myThread, "e");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }


}
