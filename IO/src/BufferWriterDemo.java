import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Administrator on 2014-09-29.
 */
public class BufferWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("demo.txt");

        BufferedWriter bufw = new BufferedWriter(fw);
        bufw.write("abcde");

        bufw.flush();
        bufw.close();
    }
}
