

/**
 * 산술연산자의 예제 코드
 */
public class ArithmeticExpressionTest {
    public static void main(String[] args) {
        System.out.print("10+3=");
        System.out.println(10+3);

        System.out.print("5.21+3.1=");
        System.out.println(5.21+3.1);

        System.out.println("5+3.1="+(5+3.1));

        System.out.println("5/2="+(5/2));
        System.out.println("5/2.0="+(5/2.0));

        System.out.println("365의 100의 자리수=" + (365/100));
        System.out.println("365의 10의 자리수=" + (365%100)/10);
        System.out.println("365의 1의 자리수=" + (365%10));

        System.out.println("365 % 2 =" + 365 % 2);    //1이면 홀수, 0이면 짝수

        System.out.println("366 % 3 =" + 366 % 3);     // 0이면 3의 배수,
    }
}
