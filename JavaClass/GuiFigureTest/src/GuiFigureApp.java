import java.util.Scanner;

public class GuiFigureApp {

	static String[] shapes = { "RECTANGLE", "CIRCLE", "TRIANGLE" };
	static String[] shapes_sound = { "rectangle.aif", "circle.aif", "triangle.aif" };

	public static void main(String[] args) {

		while (true) {
			int select = getUserInput();
			if (select == 4)
				break;
			rotate(select);
			playSound(select);
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

	static void rotate(int shapeNum) {
		System.out.println("도형 360도 회전:"+shapes[shapeNum-1]);
	}

	static void playSound(int shapeNum) {
		System.out.println("AIF 사운드 재생:"+shapes_sound[shapeNum-1]);
	}

}
