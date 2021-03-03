package cafePackage;

public class Drink {
	String name;
	double price;
	int quantity;
	
	Drink(String name, double price){
		this.name = name;
		this.price = price;
	}
	
	void name(String name) {
		this.name = name;
	}
	
	void price(double price) {
		this.price = price;
	}
	
	void quantity(int quantity) {
		this.quantity = quantity;
	}
	
	int getQuantity() {
		return quantity;
	}
	
	String getName() {
		return name;
	}

	double getPrice() {
		return price;
	}
	
	double getTotal() {
		return quantity * price;
	}

}
