package domain;

public class Menu {
	final int MAX_ITEMS = 5;
	private int numberOfItems = 0;
	private MenuItem[] menuItems;

	public Menu() {
		menuItems = new MenuItem[MAX_ITEMS];
	}

	public void addItem(String name, String description, int price) {
		menuItems[numberOfItems++] = new MenuItem(name, description, price);
	}

	public MenuItem[] getMenuItems() {
		return menuItems;
	}
}