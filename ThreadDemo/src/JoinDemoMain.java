/**
 * Created by Administrator on 2014-09-27.
 */

class JoinDemo implements Runnable{

    @Override
    public void run() {
        for(int x= 0; x< 70; x++){
            System.out.println(Thread.currentThread().getName() + "......"+x);
        }
    }
}


public class JoinDemoMain {
    public static void main(String[] args) throws InterruptedException {
        JoinDemo j = new JoinDemo();
        Thread t1 = new Thread(j);
        Thread t2 = new Thread(j);


        t1.start();
        t2.start();

        t1.join();


        for(int x = 0; x< 80;x++){
            System.out.println(Thread.currentThread().getName() + x);
        }
    }
}
