package Thread_synchronized;

public class Desc {

    /**
     * 四 synchronized方法与锁对象
     * 通过上面我们知道synchronized取得的锁都是对象锁，而不是把一段代码或方法当做锁。
     * 如果多个线程访问的是同一个对象，哪个线程先执行带synchronized
     * 关键字的方法，则哪个线程就持有该方法，那么其他线程只能呈等待状态。
     * 如果多个线程访问的是多个对象则不一定，因为多个对象会产生多个锁。
     */


    /**
     * 七 同步不具有继承性
     * 如果父类有一个带synchronized关键字的方法，子类继承并重写了这个方法。
     * 但是同步不能继承，所以还是需要在子类方法中添加synchronized关键字。
     */

}
