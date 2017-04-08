package com.kwanwoo.java;

/**
 *
 * String 클래스의 주요한 메소드를 테스트하는 코드
 */

public class StringTest {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = "World";

        char c1 = str1.charAt(0);
        char c2 = str1.charAt(str1.length()-1);
        System.out.printf("%s의 첫 문자는 %c이고 마지막 문자는 %c이다\n",
                                                str1,c1,c2);

        if (str1.compareTo(str2) < 0)
            System.out.printf ("%s와 %s의 결합은 %s 이다\n",
                                str1, str2, str1.concat(str2));
        else if (str1.compareTo(str2) >0)
            System.out.printf ("%s와 %s의 결합은 %s 이다\n",
                                str1, str2, str2.concat(str1));

        if (str1.contains("H"))
            System.out.printf ("%s에서 %s를 %s로 바꾸면 %s 이다\n",
                                str1, "H", "Y", str1.replace("H","Y"));


    }
}
