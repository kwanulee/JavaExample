package domain;

public class Restaurant {
	private Menu menu;
	
	public Restaurant() {
		menu = new Menu();
		menu.addItem("김밥", "불고기 김밥", 3000);
		menu.addItem("떡복이", "단짠 떡복이", 3000);
		menu.addItem("순대", "오징어 순대", 4000);
		menu.addItem("라면", "해물 라면", 5000);
		menu.addItem("오뎅", "부산 어묵", 2000);
	}
	
	public void printMenu() {
		MenuItem[] menuItems = menu.getMenuItems();

		for (int i = 0; i < menuItems.length; i++) {
			MenuItem menuItem = menuItems[i];
			System.out.print(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice() + " ");
			System.out.println("\t"+ menuItem.getDescription());
		}
	}
}
