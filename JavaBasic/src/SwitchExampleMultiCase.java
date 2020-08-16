import java.util.Scanner;

public class SwitchExampleMultiCase {
    public static void main(String[] args) {
        int month;
        Scanner scanner = new Scanner(System.in);

        System.out.print("월을 입력하시오(1~12):");
        month = scanner.nextInt();

        switch(month) {
            case 1:
            case 2:
            case 12:
            	System.out.println("겨울 입니다.");
            	break;
            case 3:
            case 4:
            case 5:
            	System.out.println("봄 입니다.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름 입니다.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을 입니다.");
                break;
            default:
            	System.out.println("잘못된 입력입니다.");
        }

    }
}
