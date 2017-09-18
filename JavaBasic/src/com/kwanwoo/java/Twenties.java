package com.kwanwoo.java;

import java.util.Scanner;

public class Twenties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("나이를 입력하시오:");
        int age = scanner.nextInt();
        if((age>=20) && (age<30)) { 		// age가 20~29 사이인지 검사
            System.out.print("20대입니다. ");
            System.out.println("20대라서 행복합니다!");
        }
        else
            System.out.println("20대가 아닙니다.");

        scanner.close();
    }
}
