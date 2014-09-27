/**
 * Created by Administrator on 2014-09-22.
 */
public class Demo extends Thread{
    public void run(){
        for(int i=0;i< 60; i++)
            System.out.println(this.getName()+" demo run" + i);
    }
}