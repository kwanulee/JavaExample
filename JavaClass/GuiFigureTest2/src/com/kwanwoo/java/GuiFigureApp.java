package com.kwanwoo.java;
import java.util.Scanner;

public class GuiFigureApp {

	static String[] shapes = { "RECTANGLE", "CIRCLE", "TRIANGLE", "AMEBA" };		// 아메바 추가 
	static String[] shapes_sound = { "rectangle.aif", "circle.aif", "triangle.aif", "ameba.hif" }; // ameba.hif 추가 

	public static void main(String[] args) {
		while (true) {
			int select = getUserInput();
			if (select == 5)		// 종료번호 변경 
				break;
			rotate(select);
			playSound(select);
		}
	}

	static int getUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("다음 중 하나의 행동을 선택하세요 ");
		System.out.println("1. 사각형클릭, 2.원클릭, 3.삼각형클릭, 4.아메바, 5.종료"); // 아메바 추가 
		System.out.print(">>");
		int select = scanner.nextInt();
		return select;
	}

	static void rotate(int shapeNum) {
		if (shapes[shapeNum-1].equals("AMEBA"))									// 추가
			System.out.println("도형의 한쪽 끝을 기준으로 360도 회전:"+shapes[shapeNum-1]);		// 추가 
		else
			System.out.println("도형의 중심을 기준으로 360도 회전:"+shapes[shapeNum-1]);
	}

	static void playSound(int shapeNum) {
		if (shapes[shapeNum-1].equals("AMEBA"))									// 추가 
			System.out.println("HIF 사운드 재생:"+shapes_sound[shapeNum-1]);		// 추가 
		else
			System.out.println("AIF 사운드 재생:"+shapes_sound[shapeNum-1]);


	}

}