

/**
 * 환영 메시지를 출력하고, 주석을 이용하여 API 문서를 생성하는 예제 프로그램 
 * @author 이관우 
 */
public class Hello {

    /**
     * 프로그램의 시작 포인트
     * @param args
     */
    public static void main(String[] args) {
        int year = 2020 ;						// 변수 year에 2020을 저장
        printGreeting(year);					// printGreeting 메소드 호출
    }

    /**
     * 연도를 입력 받아 해당 연도 Java Class로의 환영 메시지 출력
     * @param year 연도
     */
    public static void printGreeting(int year) {
        System.out.print("Welcome to ");        // 문자열 "Welcome to " 출력
        System.out.print(year);                 // 변수 year의 값을 출력
        System.out.print(" Java Class");        // 문자열 " Java Class" 출력
    }
}
