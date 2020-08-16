import java.util.Scanner;

public class DoWhileExample_ValidMonth {

	public static void main(String[] args) {
		int month;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("올바른 월(1~12)을 입력하시오 >>");
			month = scanner.nextInt();
		}while(month < 1 || month > 12);
		
		System.out.printf("입력한 달은 %d 입니다.",month);
	}

}
