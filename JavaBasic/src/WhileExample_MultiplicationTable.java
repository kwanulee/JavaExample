
public class WhileExample_MultiplicationTable {

	public static void main(String[] args) {
		int i=1, j;
		while (i <= 9) {
			j =1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j); // 구구셈 출력
				System.out.print('\t');
				j++;
			}
			i++;
			System.out.println();
		}
	}
}
