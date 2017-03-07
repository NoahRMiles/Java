import java.util.Scanner;

public class sales_Tax {

	public static void main(String[] args) {
		double state = 0.055;
		double county = 0.02;
		double totalTax;
		double purchase;
		double total;
		double stateTotal;
		double countyTotal;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter Purchase Price: ");
		purchase = keyboard.nextDouble();
		
		totalTax = state + county;
		total = purchase *  totalTax + purchase;
		stateTotal = purchase * state;
		countyTotal = purchase * county;
		
		System.out.printf("THe purchase price is $%.2f, the state tax is $%.2f, the county tax is $%.2"
				+ "f, the total tax is $%.2f", purchase, stateTotal, countyTotal, total);

	}

}
