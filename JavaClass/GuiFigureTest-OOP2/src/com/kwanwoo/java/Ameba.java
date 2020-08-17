package com.kwanwoo.java;

public class Ameba {
	final String shape = "AMEBA";
	final String sound = "ameba.hif";
	
	void rotate() {
		System.out.println("도형의 한쪽 끝을 기준으로 360도 회전:"+shape);
	}
	
	void playSound() {
		System.out.println("HIF 사운드 재생:"+sound);
	}
}
