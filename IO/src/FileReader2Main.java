import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Administrator on 2014-09-28.
 */
public class FileReader2Main {

    public static void main(String[] args){

        try {
            FileReader fr =  new FileReader("demo.txt");
            char[] buf = new char[1024];


            int num = 0;
            while((num = fr.read(buf)) != -1){
                System.out.print(new String(buf, 0, num));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
