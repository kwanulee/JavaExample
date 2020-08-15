import java.util.Scanner;

public class ArithmeticOperatorExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("초단위의 정수를 입력하시오> ");
		int input = scanner.nextInt();
		
		System.out.printf("%d초는 %d시간 %d분 %d초 입니다.",
				input,
				input/60/60,
				input/60%60,
				input%60);
	}

}
