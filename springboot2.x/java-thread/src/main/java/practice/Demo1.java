package practice;

public class Demo1 {
/**
 * @Auther: ltc
 * @Date: 2018/7/16 14:12 
 * @Description:
 * 题目：建立三个线程，A线程打印10次A，B线程打印10次B,C线程打印10次C，要求线程同时运行，交替打印10次ABC。
 *
 * 　　1.看到三个线程，同时运行，交替打印，和大神解答写的各种流程、sleep、synchronized、wait、notify一阵头痛。还是自己慢慢来，打印10个A先。。
 */
    public static void main(String[] args) throws InterruptedException {
        Object c = new Object();
        Object b = new Object();
        Object a = new Object();
        Thread thread = new Thread(new MyThread1(c,a),"A");
        Thread thread2 = new Thread(new MyThread1(a,b),"B");
        Thread thread3 = new Thread(new MyThread1(b,c),"C");
        thread.start();
        Thread.sleep(10);
//        thread.join();
        thread2.start();
//        thread2.join();
        Thread.sleep(10);
        thread3.start();

        /**
         * AAAAAAACCAAA
         * BBBBBBBBBB
         * CCCCCCCC
         */

    }

}
