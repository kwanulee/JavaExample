import java.util.Scanner;

public class GuiFigureApp {

	static String[] shapes = { "RECTANGLE", "CIRCLE", "TRIANGLE" };
	static String[] shapes_sounds = { "rectangle.aif", "circle.aif", "triangle.aif" };

	public static void main(String[] args) {
		screenOutput();
		while (true) {
			int select = getUserInput();
			if (select == 4)
				break;
			rotate(select);
			playSound(select);
		}
	}

	static void screenOutput() {
		System.out.println("--------------------------");
		System.out.println("사각형, 원, 삼각형을 화면에 출력 ");
		System.out.println("--------------------------");
	}

	static int getUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("다음 중 하나의 행동을 선택하세요 ");
		System.out.println("1. 사각형클릭, 2.원클릭, 3.삼각형클릭, 4.종료");
		System.out.print(">>");
		int select = scanner.nextInt();
		return select;
	}

	static void rotate(int shapeNum) {
		System.out.println("도형 360도 회전:"+shapes[shapeNum-1]);
	}

	static void playSound(int shapeNum) {
		System.out.println("AIF 사운드 재생:"+shapes_sounds[shapeNum-1]);


	}

}
