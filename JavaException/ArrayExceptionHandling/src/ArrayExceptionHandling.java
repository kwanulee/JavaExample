
public class ArrayExceptionHandling {

	public static void main(String[] args) {
		int intArray[] = new int[5];

		try {
			intArray[3] = 10; // 예외 발생하지 않음
			intArray[6] = 5; // 예외 발생
		} catch (ArrayIndexOutOfBoundsException e) { // 객체 e에 예외 정보가 넘어옴
			System.out.println("배열의 범위를 초과하여 원소를 접근하였습니다.");
		}
	}

}
