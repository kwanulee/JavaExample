
import java.util.Scanner;

/**
 * 키보드로부터 학생 수를 입력 받아 학생 수 만큼의 배열을 생성하고, 학생들의 성적을 입력 받아 배열에 저장한 후에, 배열에 저장된 학생들
 * 성적의 평균을 구하는 프로그램
 */
public class ArrayTest1 {
	public static void main(String[] args) {
		int total = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("학생 수를 입력하시오:");
		int students = scanner.nextInt();
		int[] scores = new int[students];

		System.out.println("학생들의 성적을 차례로 입력하시오");
		for (int i = 0; i < students; i++) {
			System.out.printf("학생[%d] 성적:", i);
			scores[i] = scanner.nextInt();
		}

		for (int i = 0; i < students; i++)
			total += scores[i];

		System.out.printf("%d명 학생의 평균 성적은 %d 입니다\n", students, total / students);
	}
}
