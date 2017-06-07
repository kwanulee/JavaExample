import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader("data/input.txt");
            out = new FileWriter("data/output.txt");
            int c;
            while ((c = in.read()) != -1) { // 한 문자씩 파일 끝까지 읽는다.
                out.write(c);
            }
            in.close();
            out.close();
        }
        catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
