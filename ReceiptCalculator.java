
public class ReceiptCalculator 
{
	public static double calcSubtotal(double appetizerPrice, double entreePrice, double drinkPrice, double dessertPrice)
	{
		return appetizerPrice + entreePrice + drinkPrice + dessertPrice;
	}
	
	public static double calcTax(double subTotal, double taxRate)
	{
		return taxRate * subTotal;
	}
	
}
