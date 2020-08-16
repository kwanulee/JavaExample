import java.util.Scanner;

public class SwitchExampleStringLiteral {
	public static void main(String[] args) {
        String month;
        Scanner scanner = new Scanner(System.in);

        System.out.print("달의 영문 이름을 입력하시오 >");
        month = scanner.next();

        switch(month) {
            case "january":
            case "february":
            case "december":
            	System.out.println("겨울 입니다.");
            	break;
            case "march":
            case "april":
            case "may":
            	System.out.println("봄 입니다.");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("여름 입니다.");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("가을 입니다.");
                break;
            default:
            	System.out.println("잘못된 입력입니다.");
        }

    }
}
