import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Administrator on 2014-10-02.
 */
public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("demo.txt");

        BufferedReader buff = new BufferedReader(fr);

        String line = null;
        //null if the end of the stream has been reached
        while((line = buff.readLine()) != null){
            System.out.println(line);
        }
        buff.close();
    }
}
