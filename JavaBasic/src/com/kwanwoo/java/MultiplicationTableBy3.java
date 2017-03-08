package com.kwanwoo.java;

/**
 * Created by kwanwoo on 2017. 3. 4..
 */
public class MultiplicationTableBy3 {
    public static void main(String[] args) {

//        for (int i = 0; i < 3; i++) {      // 3단씩 3번 반복
//            for (int j = 1; j < 10; j++) { // 단에 대한 반복
//                for (int k = 1; k<4; k++) {// 각 단의 곱셈
//                    System.out.print((3*i+k) + "*" + j + "=" + j * (3*i+k)); // 구구셈 출력
//                    System.out.print('\t'); // 하나씩 탭으로 띄기
//                }
//                System.out.println(); // 한 줄을 출력한 후에 다음 줄로 커서 이동
//            }
//            System.out.println(); // 3단 씩의 출력 끝나면 한 줄 띄움
//        }

        for (int k =1; k<10; k+=3) {            // 3단씩 3번 반복
            for (int i = 1; i < 10; i++) {      // 단에 대한 반복. 1단에서 9단
                for (int j = k; j < 10; j++) {  // 각 단의 곱셈
                    System.out.print(j + "*" + i + "=" + i * j); // 구구셈 출력
                    System.out.print('\t'); // 하나씩 탭으로 띄기
                    if (j % 3 == 0) break;
                }
                System.out.println(); // 3단 씩의 출력 끝나면 한 줄 띄움
            }
            System.out.println();
        }
    }
}
