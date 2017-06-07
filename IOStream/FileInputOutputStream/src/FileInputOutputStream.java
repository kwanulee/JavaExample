import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStream {
    public static void main(String[] args) {
        byte b[] = {7,51,3,4,-1,24};

        try {
            FileOutputStream fout = new FileOutputStream("test.out");
            for(int i=0; i<b.length; i++)
                fout.write(b[i]); // 배열 b의 바이너리를 그대로 기록
            System.out.println("test.out을 저장하였습니다.");

            FileInputStream fin = new FileInputStream("test.out");
            int n=0, c;
            while((c = fin.read())!= -1)
                b[n++] = (byte)c; // 읽은 바이트를 배열에 저장

            System.out.println("test.out에서 읽은 배열을 출력합니다.");
            for(int i=0; i<b.length; i++)
                System.out.print(b[i]+" ");

            fout.close();
            fin.close();
        } catch(IOException e) { }




    }
}
