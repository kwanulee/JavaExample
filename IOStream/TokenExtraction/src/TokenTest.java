import java.util.Scanner;
import java.io.*;

public class TokenTest {
    public static void main(String[] args)  {

        try {
            Scanner s = new Scanner(new FileReader("data/input.txt"));
            while (s.hasNext()) {
                System.out.println(s.next());
            }

            if (s != null) {
                s.close();
            }
        } catch (IOException e) {}
    }
}
