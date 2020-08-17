package com.kwanwoo.java;

public class Rectangle {
	final String shape = "RECTANGLE";
	final String sound = "rectangle.aif";
	
	void rotate() {
		System.out.println("도형의 중심을 기준으로 360도 회전:"+shape);
	}
	
	void playSound() {
		System.out.println("AIF 사운드 재생:"+sound);
	}
}
