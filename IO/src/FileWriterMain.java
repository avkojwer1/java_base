import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Administrator on 2014-09-28.
 */
public class FileWriterMain {

    public static void main(String[] args){

        try {
            FileWriter fw = new FileWriter("demo.txt");
            fw.write("jingjing");

            fw.flush();

            fw.write("jingjing");

            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
