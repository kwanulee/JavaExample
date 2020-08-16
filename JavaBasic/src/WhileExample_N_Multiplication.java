import java.util.Scanner;

public class WhileExample_N_Multiplication {
	public static void main(String[] args) {
		System.out.print("구구단 중에서 출력하고 싶은 단은? >> ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int i = 1;
		while (i <= 9) {
			System.out.println(n + "*"+ i + "=" + n * i);
			i++;
		}
	}
}
