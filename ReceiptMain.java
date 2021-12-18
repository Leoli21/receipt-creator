import java.util.Scanner;

public class ReceiptMain
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		//Prompting name of Appetizer and price of Appetizer
		System.out.print("Appetizer: ");
		String appetizer = in.nextLine();	
		
		System.out.print("App Price: $ ");
		double appetizerPrice = in.nextDouble();
		in.nextLine();
		
		
		//Prompting name of Entree and price of Entree
		System.out.print("Entree: ");
		String entree = in.nextLine();	
		
		System.out.print("Entree price: $ ");
		double entreePrice = in.nextDouble();
		in.nextLine();
		
		
		//Prompting name of Drink and price of Drink
		System.out.print("Drink: ");
		String drink = in.nextLine();	
		
		System.out.print("Drink Price: $ ");
		double drinkPrice = in.nextDouble();
		in.nextLine();
		
		
		//Prompting name of Dessert and price of Dessert
		System.out.print("Dessert: ");
		String dessert = in.nextLine();
		
		System.out.print("Dessert Price: $ ");
		double dessertPrice = in.nextDouble();
		
			
		//Calculating Subtotal with calcSubtotal Static Method
		double subTotal = ReceiptCalculator.calcSubtotal(appetizerPrice, entreePrice, drinkPrice, dessertPrice);
			
		//Calculating Tax Value at 6% with calcTax Static Method
		double tax = ReceiptCalculator.calcTax(subTotal, 0.06);
		
		//Total Price
		double totalPrice = subTotal + tax;
		
		//Generating Sales Receipt
		System.out.printf("%-30s%20.2f", appetizer, appetizerPrice);
		System.out.printf("\n%-30s%20.2f", entree, entreePrice);
		System.out.printf("\n%-30s%20.2f", drink, drinkPrice);
		System.out.printf("\n%-30s%20.2f", dessert, dessertPrice);
		System.out.printf("\n%-30s%20.2f", "Subtotal", subTotal);
		System.out.printf("\n%-30s%20.2f", "Tax(6%)", tax);
		System.out.println("\n****************************************************");
		System.out.printf("%-30s%20.2f", "Total", totalPrice);					
		
	}

}
