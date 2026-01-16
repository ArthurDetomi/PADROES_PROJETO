package DECORATOR.lowercaseinput;

import java.io.*;

public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("./DECORATOR/lowercaseinput/test.txt")));

            while ((c = in.read()) >= 0) {
                System.out.println((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
