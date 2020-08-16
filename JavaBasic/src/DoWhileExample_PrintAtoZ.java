
public class DoWhileExample_PrintAtoZ {

	public static void main(String[] args) {
		char c = 'a';				// 문자 a에 해당되는 유니코드 값이 저장
		
		do {
			System.out.print(c++);	// 영문 알파벳 코드 값에 1을 더하면 다음 문자의 코드 값이 됨  
		} while (c <= 'z');
	}

}
