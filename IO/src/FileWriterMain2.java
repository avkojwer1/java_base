import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Administrator on 2014-09-28.
 */
public class FileWriterMain2 {

    public static void main(String[] args){

        FileWriter fw = null;

        try {
            //true 代表续写
            fw = new FileWriter("demo.txt", true);
            fw.write("jingjing");


        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(fw != null)
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }

}
