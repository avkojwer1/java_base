/**
 * Created by Administrator on 2014-09-27.
 */
public class ProducerConsumerDemo {

    public static void main(String[] args) {

        Res res = new Res();
        Producer p = new Producer(res);
        Consumer c = new Consumer(res);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);

        Thread t3 = new Thread(p);
        Thread t4 = new Thread(c);


        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class Producer implements Runnable{
    public Producer(Res res){
        this.res = res;
    }

    private Res res;

    @Override
    public void run() {
        while(true){
            res.set("mac min");
        }

    }
}

class Consumer implements Runnable{
    public Consumer(Res res){
        this.res = res;
    }

    private Res res;

    @Override
    public void run() {
        while(true){
            res.out();
        }
    }
}


class Res{
    private String name;
    private int count = 1;
    private boolean flag = false;

    public synchronized void set(String name){
        while(this.flag)
        {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        this.name = name + "--" + count++;
        System.out.println(Thread.currentThread().getName() + "....生产者..." + this.name);
        flag = true;
        this.notifyAll();
    }

    public synchronized void out(){
        while(!this.flag)
        {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println(Thread.currentThread().getName() + "....消费者..." + this.name);
        flag = false;
        this.notifyAll();
    }

}

