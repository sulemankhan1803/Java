package exercise;

public class MobilePhone {
	private String brand;
	private String model;
	private double price;

	public MobilePhone(String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	// Method to compare two mobile phones based on price
	public void comparePrice(MobilePhone otherPhone) {
		if (this.price > otherPhone.price) {
			System.out.println(this.brand + " " + this.model + " is more expensive than " + otherPhone.brand + " "
					+ otherPhone.model);
		} else if (this.price < otherPhone.price) {
			System.out.println(otherPhone.brand + " " + otherPhone.model + " is more expensive than " + this.brand + " "
					+ this.model);
		} else {
			System.out.println(this.brand + " " + this.model + " and " + otherPhone.brand + " " + otherPhone.model
					+ " have the same price.");
		}
	}

	public static void main(String[] args) {
		MobilePhone phone1 = new MobilePhone("Apple", "iPhone 12", 999.99);
		MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S21", 899.99);

		phone1.comparePrice(phone2);
	}
}
