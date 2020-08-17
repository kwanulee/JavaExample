import java.util.Scanner;

public class GuiFigureApp {

	static String[] shapes = { "RECTANGLE", "CIRCLE", "TRIANGLE", "AMEBA" };		// 아메바 추가 
	static String[] shapes_sounds = { "rectangle.aif", "circle.aif", "triangle.aif", "ameba.hif" }; // ameba.hif 추가 

	public static void main(String[] args) {
		screenOutput();
		while (true) {
			int select = getUserInput();
			if (select == 5)		// 종료번호 변경 
				break;
			rotate(select);
			playSound(select);
		}
	}

	static void screenOutput() {
		System.out.println("--------------------------");
		System.out.println("사각형, 원, 삼각형, 아메바를 화면에 출력 ");	// 아메바 추가 
		System.out.println("--------------------------");
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
			System.out.println("HIF 사운드 재생:"+shapes_sounds[shapeNum-1]);		// 추가 
		else
			System.out.println("AIF 사운드 재생:"+shapes_sounds[shapeNum-1]);


	}

}