package com.kwanwoo.java;

import java.util.StringTokenizer;

/**
 * StringTokenizer 클래스의 주요한 메소드를 테스트하는 코드
 */
public class StringTokenizerTest {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("2017-04-06T18:10","-T:");
        while (st.hasMoreElements()) {
            System.out.println(st.nextToken());
        }
    }
}
