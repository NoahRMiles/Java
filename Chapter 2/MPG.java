import java.util.Scanner;

public class MPG {

	public static void main(String[] args) {
		double miles;
		double gallons;
		double MPG;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter The miles taveled: ");
		miles = keyboard.nextDouble();
		System.out.print("Enter the gallons used: ");
		gallons = keyboard.nextDouble();
		
		MPG = miles / gallons;
		
		System.out.printf("The MPG is : %.3f", MPG);
		

	}

}
