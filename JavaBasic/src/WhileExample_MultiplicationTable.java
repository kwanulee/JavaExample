/**
 * 
 * 다음 프로그램은 구구단 출력을 while 문을 이용하여 구현한 것이지만, 오류가 있어서 정상적인 결과가 
 * 출력이 되지 않고 1단만 출력이 됩니다. 이 프로그램의 논리적인 오류를 찾아 고쳐보세요
 *
 */
public class WhileExample_MultiplicationTable {

	public static void main(String[] args) {
		int i=1, j=1;
		while (i <= 9) {
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
