import java.util.Scanner;

/**
 * ArrayList<String> 대신에 String 배열을 사용한 예제
 */
public class ArrayTest {
    public static void main(String[] args) {
        final int SIZE=10;
        String [] aList = new String[SIZE];
        int count=0;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("이름을 입력하세요>>");
            String s = scanner.next(); // 키보드로부터 이름 입력
            if (s.equals("exit"))
                break;
            aList[count++] = s; // ArrayList 컬렉션에 삽입
        } while (true);


        // ArrayList에 들어 있는 모든 이름 출력
        for(int i=0; i<count; i++) {
            String name = aList[i];  // ArrayList의 i 번째 문자열 얻어오기
            System.out.print(name + " ");
        }
    }
}
