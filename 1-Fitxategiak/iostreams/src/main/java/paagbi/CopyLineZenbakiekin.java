package paagbi;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyLineZenbakiekin {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("1-Fitxategiak/iostreams/xanadu.txt");
            out = new FileOutputStream("outagain.txt");
            int c;
            int n =2;

            out.write(("1. ").getBytes());
            while ((c = in.read()) != -1) {
                out.write(c);
                if(c == '\n') {
                    out.write((n+". ").getBytes());
                    n++;
                }
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}