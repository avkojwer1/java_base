/**
 * Created by Administrator on 2014-09-25.
 */
public class Single {

    private static Single s = null;

    private Single(){}

    public static Single getInstance(){
        if(s == null){
            synchronized(Single.class){
                if(s == null){
                    s = new Single();
                }
            }
        }

        return s;
    }

}
