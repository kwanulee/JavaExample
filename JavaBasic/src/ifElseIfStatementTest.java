

import java.util.Scanner;

/**
 * Created by kwanwoo on 2017. 3. 4..
 */
public class ifElseIfStatementTest {
    public static void main(String[] args) {
        int month;
        Scanner scanner = new Scanner(System.in);

        System.out.print("월을 입력하시오(1~12):");
        month = scanner.nextInt();

        if (month == 1)
            System.out.println("January");
        else if (month == 2)
            System.out.println("February");
        else if (month == 3)
            System.out.println("March");
        else if (month == 4)
            System.out.println("April");
        else if (month == 5)
            System.out.println("May");
        else if (month == 6)
            System.out.println("June");
        else if (month == 7)
            System.out.println("July");
        else if (month == 8)
            System.out.println("August");
        else if (month == 9)
            System.out.println("September");
        else if (month == 10)
            System.out.println("October");
        else if (month == 11)
            System.out.println("November");
        else if (month == 12)
            System.out.println("December");


    }
}
