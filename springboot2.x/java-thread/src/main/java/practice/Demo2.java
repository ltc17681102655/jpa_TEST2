package practice;

public class Demo2 {

    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        myThread2.setName("a");

        MyThread2 myThread3 = new MyThread2();
        myThread3.setName("b");

        myThread2.start();
        myThread3.start();
    }

}
