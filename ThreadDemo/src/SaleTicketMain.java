/**
 * Created by Administrator on 2014-09-23.

简单买票程序
 多个窗口买票
 */
public class SaleTicketMain {

    public static void main(String[] args) {
        Ticket t = new Ticket();

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        Thread t4 = new Thread(t);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class Ticket implements Runnable{

    private int tick = 1000;

    private Object o = new Object();

    @Override
    public void run(){
        while(true){
            synchronized(o){
                if(tick > 0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+ " sale : " + tick--);
                }
            }

        }
    }
}

