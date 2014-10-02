import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Administrator on 2014-09-28.
 */
public class FileReaderMain {

    public static void main(String[] args){

        try {
            FileReader fr =  new FileReader("demo.txt");
            int ch = 0;

            while((ch = fr.read()) != -1){
                System.out.print((char)ch);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
