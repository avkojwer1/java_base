/**
 * Created by Administrator on 2014-09-25.
 */

class Resource {
    private String name;
    private String sex;

    int x = 0;

    public synchronized void set() {

        if (this.flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (x == 0) {
            this.name = "jingjing";
            this.sex = "man";
        } else {

            this.name = "lili";
            this.sex = "relman";
        }

        x = (x + 1) % 2;

        this.flag = true;
        this.notify();

    }

    public synchronized void out(){
        if(!this.flag)
        {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(this.name + "........." + this.sex);

        this.flag = false;
        this.notify();
    }


    boolean flag;
}

class Input implements Runnable{

    private Resource r;

    Input(Resource r){
        this.r = r;
    }

    @Override
    public void run() {
        int x = 0;
        while(true){
           synchronized(r){
             r.set();
           }
        }
    }
}

class Output implements Runnable{

    private Resource r;

    Output(Resource r){
        this.r = r;
    }

    @Override
    public void run() {
        while(true){
            r.out();
        }
    }
}



public class InputOutputDemo {

    public static void main(String[] args) {

        Resource r = new Resource();

        Input in = new Input(r);
        Output out = new Output(r);

        Thread t1 = new Thread(in);
        Thread t2 = new Thread(out);

        t1.start();
        t2.start();
    }

}
