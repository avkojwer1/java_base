/**
 * Created by Administrator on 2014-09-27.
 */

class StopThread implements Runnable{

    private boolean flag = true;

    public void changeFlag(){
        flag = false;
    }


    @Override
    public synchronized void run() {
        while(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "InterruptedException ");
                flag =false;
            }
            System.out.println(Thread.currentThread().getName() + "run....");
        }
    }
}

public class StopThreadMain {

    public static void main(String[] args) {
        StopThread s = new StopThread();

        Thread t1= new Thread(s);
        Thread t2= new Thread(s);

        t1.start();
        t2.start();

        int num = 0;
        while(true){
            System.out.println(Thread.currentThread().getName() + "...." +num);
            if(num++ == 60){
               t1.interrupt();
                t2.interrupt();
                break;
            }
        }

    }
}
