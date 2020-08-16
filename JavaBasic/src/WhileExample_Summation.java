
public class WhileExample_Summation {
	public static void main(String[] args) {
		int n = 1;
		int sum = 0;
		
		while (n <= 10) {
			sum += n++;
		}
		System.out.println("1부터 10까지의 합은 "+sum);
	}
}
