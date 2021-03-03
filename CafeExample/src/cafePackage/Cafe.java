package cafePackage;

import java.util.Scanner;

public class Cafe {
	public static void main(String [] args) {
		System.out.println("Welcome to our cafe!\n");
		
		Scanner sc = new Scanner(System.in);	
		
		Food scone = new Food("Scone", 2.00);
		Food crossiant = new Food("Crossiant", 2.00);
		Drink tea = new Drink("Tea", 1.00);
		Drink coffee = new Drink("Coffee", 1.00);
		
//		Food[] foods = {scone, crossiant};
//		Drink[] drinks = {tea, coffee};
//		
//		Menu menu = new Menu(foods, drinks);
			
		String input = "";
		String input2 = "";
		boolean cont = true;
		boolean cont2 = true;
		String foodOrder = "";
		String drinkOrder = "";
		String orderQuantity = "";	
		
		while(cont2) {
			System.out.println("\tMenu:");
			System.out.println("\tScone\t\t$" + scone.getPrice());
			System.out.println("\tCrossiant\t$" + crossiant.getPrice());
			System.out.println("\tTea\t\t$" + tea.getPrice());
			System.out.println("\tCoffee\t\t$" + coffee.getPrice() +"\n");
			
			while(cont2) {
			//Get item
			System.out.println("What would you like to order?");			
			foodOrder = sc.nextLine();
			
			if(foodOrder.equalsIgnoreCase("scone")){
				System.out.println("How many would you like to order?");
				//Get quantity
				orderQuantity = sc.nextLine();
				scone.quantity = Integer.parseInt(orderQuantity);		
			}
			else if(foodOrder.equalsIgnoreCase("crossiant")) {
				System.out.println("How many would you like to order?");
				//Get quantity
				orderQuantity = sc.nextLine();
				crossiant.quantity = Integer.parseInt(orderQuantity);
			}
			else if(foodOrder.equalsIgnoreCase("tea")) {
				System.out.println("How many would you like to order?");
				//Get quantity
				orderQuantity = sc.nextLine();
				tea.quantity = Integer.parseInt(orderQuantity);
			}
			else if(foodOrder.equalsIgnoreCase("coffee")) {
				System.out.println("How many would you like to order?");
				//Get quantity
				orderQuantity = sc.nextLine();
				coffee.quantity = Integer.parseInt(orderQuantity);
			}
			else {
				System.out.println("Sorry. That order was invalid.");
			}	
			
			System.out.println("Would you like to order again?");
			input2 = sc.nextLine();
			
			if(input2.equalsIgnoreCase("n")) {
				System.out.println("\tThis is your reciept.");
				System.out.println("Scone(s): Quantity: " + scone.getQuantity());
				System.out.println("Price: $" + scone.getTotal());
				System.out.println();
				System.out.println("Crossiant(s): " + crossiant.getQuantity());
				System.out.println("Price: $" + crossiant.getTotal());
				System.out.println();
				System.out.println("Tea(s): " + tea.getQuantity());
				System.out.println("Price: $" + tea.getTotal());
				System.out.println();
				System.out.println("Coffee(s): " + coffee.getQuantity());
				System.out.println("Price: $" + coffee.getTotal());
				System.out.println();
				System.out.println("Total Price: $" + (scone.getTotal()+ crossiant.getTotal() + tea.getTotal()+ coffee.getTotal()));
				System.out.println("Food Price Total: $" + (scone.getTotal()+ crossiant.getTotal()));
				System.out.println("Drink Price Total: $" + (tea.getTotal()+ coffee.getTotal()));
				
				cont2 = false;
			}
		
			}
		
//		if(input.equals("q")) {
//			cont = false;
//		}
		}
		
		
	}

}
