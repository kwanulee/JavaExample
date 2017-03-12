package com.kwanwoo.java;

import java.util.Scanner;

/**
 * Created by kwanwoo on 2017. 3. 11..
 */
public class ArrayTest3 {
    public static void main(String[] args) {
        int [][] scoresByAssignments = getArray();
        inputGrade(scoresByAssignments);
        print(scoresByAssignments);
    }

    private static int[][] getArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생 수를 입력하시오:");
        int students = scanner.nextInt();

        System.out.print("과제 수를 입력하시오:");
        int assignments = scanner.nextInt();
        int[][] scoresByAssigns = new int[assignments][students];

        return scoresByAssigns;
    }

    private static void inputGrade(int[][] scoresByAssigns) {
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<scoresByAssigns.length; i++) {
            System.out.printf("과제 %d의 학생 성적을 차례로 입력하시오\n",i);
            for (int j = 0; j < scoresByAssigns[i].length; j++) {
                System.out.printf("학생 S[%d]의 과제 A[%d] 성적:", j,i);
                scoresByAssigns[i][j] = scanner.nextInt();
            }
        }
    }

    private static void print(int[][] scoresByAssigns) {
        System.out.printf("    \t");
        for(int i=0; i<scoresByAssigns[0].length; i++)
            System.out.printf("S[%d]\t",i);
        System.out.println();

        for (int i=0; i< scoresByAssigns.length; i++) {
            System.out.printf("A[%d]",i);
            for (int j = 0; j < scoresByAssigns[i].length; j++)
                System.out.printf("%5d\t", scoresByAssigns[i][j]);
            System.out.println();
        }
    }
}
