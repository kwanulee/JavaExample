import java.util.ArrayList;
import java.util.Scanner;

/**
 * Collection 중 ArrayList<E>를 테스트하는 프로그램
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("이름을 입력하세요>>");
            String s = scanner.next(); // 키보드로부터 이름 입력
            if (s.equals("exit"))
                break;
            aList.add(s); // ArrayList 컬렉션에 삽입
        } while (true);

        // ArrayList에 들어 있는 모든 이름 출력
        for(int i=0; i<aList.size(); i++) {
            String name = aList.get(i);  // ArrayList의 i 번째 문자열 얻어오기
            System.out.print(name + " ");
        }
    }
}
