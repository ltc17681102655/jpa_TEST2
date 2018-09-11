package base;

public class TestFinalize {
    /**
     * JVM启动至少启动了垃圾回收线程和主线程，所以是多线程的。
     * <p>
     * 证明jvm是多线程的(足够多时)
     *
     * @param args
     */
    public static void main(String[] args) {

        for (int i = 0; i < 1000000; i++) {
            new MyThread6();
        }

        for (int i = 0; i < 100; i++) {
            System.out.println("我是主线程的执行代码==================================================");
        }

    }

}
