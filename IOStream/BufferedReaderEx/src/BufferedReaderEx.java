import java.io.*;

public class BufferedReaderEx {
    public static void main(String[] args) {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        try {
            inputStream = new BufferedReader(new FileReader("data/input.txt"));
            outputStream = new PrintWriter(new FileWriter("data/output.txt"));
            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);
                System.out.println(l);
            }

            inputStream.close();
            outputStream.close();
        } catch (IOException e) {}

    }
}
