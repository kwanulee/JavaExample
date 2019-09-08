
import java.util.Scanner;

/**
 * 키보드로부터 학생 수를 입력 받아 학생 수 만큼의 배열을 생성하고, 학생들의 성적을 입력 받아 배열에 저장한 후에, 배열에 저장된 학생들
 * 성적의 평균을 구하는 프로그램
 *
 * 배열 생성, 배열에 값 저장, 배열 사용 부분을 메소드로 각각 분리하여 구현함
 */
public class ArrayTest2 {
	public static void main(String[] args) {
		int[] array = getArray();
		inputGrade(array);
		calculateAverage(array);
	}

	private static int[] getArray() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("학생 수를 입력하시오:");
		int students = scanner.nextInt();
		int[] scores = new int[students];

		return scores;
	}

	private static void inputGrade(int[] scores) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생 성적을 차례로 입력하시오");
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("학생[%d] 성적:", i + 1);
			scores[i] = scanner.nextInt();
		}
	}

	private static void calculateAverage(int[] scores) {
		int total = 0;
		for (int i = 0; i < scores.length; i++)
			total += scores[i];

		System.out.printf("학생들의 평균 성적은 %d 입니다\n", total / scores.length);
	}
}
