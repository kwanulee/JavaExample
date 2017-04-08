package com.kwanwoo.java;

/**
 * Integer 클래스의 주요한 메소드를 테스트하는 코드
 */
public class WrapperTest {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt("28")); // 문자열 "28"을 10진수로 변환
        System.out.println(Integer.toString(28)); // 정수 28을 2진수 문자열로 변환
        System.out.println(Integer.toBinaryString(28)); // 28을 16진수 문자열로 변환
        System.out.println(Integer.bitCount(28)); // 28에 대한 2진수의 1의 개수
        Integer i = new Integer(28);
        System.out.println(i.doubleValue()); // 정수를 double 값으로 변환. 28.0

    }
}
