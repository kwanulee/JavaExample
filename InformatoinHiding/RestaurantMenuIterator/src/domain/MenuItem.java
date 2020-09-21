package domain;

class MenuItem {

	private String name;
	private String description;
	private int price;

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getPrice() {
		return price;
	}

	public MenuItem(String name, String description, int price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}
}