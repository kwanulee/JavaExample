import java.util.Scanner;

public class BreakTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료합니다.");
		while (true) {
			System.out.print(">>");
			String text = scanner.nextLine();	// 한 줄의 문자열을 읽 text에 저장
			if (text.equals("exit")) 			// 문자열 비교는 equals() 메소드 이용 
				break;
		}
		System.out.println("종료합니다..");
		scanner.close();
	}

}
