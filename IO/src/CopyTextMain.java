import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Administrator on 2014-09-28.
 */
public class CopyTextMain {

    public static void main(String[] args) throws IOException {
        copy_2();
    }

    public static void copy_2(){
        FileWriter fw = null;
        FileReader fr = null;
        try{
            fw = new FileWriter("123.txt");
            fr = new FileReader("demo.txt");

            char[] buf = new char[1024];
            int len = 0;
            while((len = fr.read(buf)) != -1){
                fw.write(buf, 0, len);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            if(fr != null)
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if(fw != null)
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }

    public static void copy_1()throws IOException{

        FileWriter fw = new FileWriter("123.txt");

        FileReader fr = new FileReader("demo.txt");

        int ch =0;
        while((ch = fr.read()) != -1){
            fw.write(ch);
        }

        fr.close();
        fw.close();
    }

}
