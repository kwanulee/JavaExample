package com.kwanwoo.java;

/**
 * Hello.java
 * 자바 프로그램 기본 구조 설명 예제
 */
public class Hello {

    /**
     * 프로그램의 시작 포인트
     * @param args
     */
    public static void main(String[] args) {
        int year = 2019 ;

        printGreeting(year);
    }

    /**
     * 연도를 입력 받아 해당 연도 Java Class로의 환영 메시지 출력
     * @param year 연도
     */
    public static void printGreeting(int year) {
        System.out.print("Welcome to ");        // 문자열 "Welcome to " 출력
        System.out.print(year);                 // 정수 year 값 2019 출력
        System.out.print(" Java Class");        // 문자열 " Java Class" 출력
    }
}
