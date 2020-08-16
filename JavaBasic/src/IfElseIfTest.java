import java.util.Scanner;

public class IfElseIfTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		int number1 = sc.nextInt();
	    if(number1 > 0 )  {
			System.out.println("양수입니다.");
		}
	    else if (number1 ==0 )  {
			System.out.println("0입니다.");
		}
	    else   {
			System.out.println("음수입니다.");
		}
	}
}
