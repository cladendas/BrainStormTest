import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class ReadFile {

//    private void read() {
public static void main(String[] args) {


        try {
            FileInputStream fstream = new FileInputStream("./file.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                System.out.println(strLine);
                String[] aa = strLine.trim().split(" ");
                int a = Integer.parseInt(aa[0]);
                int b = Integer.parseInt(aa[1]);
                int c = Integer.parseInt(aa[2]);
                System.out.println("a: " + a + " b: " + b + " c: " + c);
            }
        }
        catch (IOException e) {
                System.out.println("Ошибка");
            }
    }
}
