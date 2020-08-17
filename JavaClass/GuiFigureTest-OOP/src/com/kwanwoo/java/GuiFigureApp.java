package com.kwanwoo.java;
import java.util.Scanner;

public class GuiFigureApp {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		while (true) {
			int select = getUserInput();
			switch(select) {
			case 1: 
				rectangle.rotate();
				rectangle.playSound();
				break;
			case 2:
				circle.rotate();
				circle.playSound();
				break;
			case 3:
				triangle.rotate();
				triangle.playSound();
				break;
			case 4:		
				return;
			}
		}
	}

	static int getUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("다음 중 하나의 행동을 선택하세요 ");
		System.out.println("1. 사각형클릭, 2.원클릭, 3.삼각형클릭, 4.종료");  
		System.out.print(">>");
		int select = scanner.nextInt();
		return select;
	}

}