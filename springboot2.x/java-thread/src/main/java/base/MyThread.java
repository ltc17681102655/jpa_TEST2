package base;

public class MyThread extends Thread {

    private Integer count = 5 ;

    public MyThread(String name){
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count>0){
            count--;
            System.out.println("线程名 == "+ Thread.currentThread().getName()+" == " + count);
        }
    }
}
