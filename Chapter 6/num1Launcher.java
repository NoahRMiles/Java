import java.text.DecimalFormat;
import java.util.Scanner;

public class num1Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate scanner class and decimal format class
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat multiple = new DecimalFormat("#,##0.00");
	
		//get user input and use scanner to gather info
		int input = 0;
		System.out.println("Enter a number to calculate area: 1 for circle,\n"
				+ "				  2 for rectangle,\n"
				+ "				  3 for Cylinder: ");
		input = keyboard.nextInt();
		keyboard.nextLine();
				
		//switch statement decides what the output will be based on the 1-2-3 input
		switch(input){
		
		case 1: 
			System.out.println("Enter the radius of a circle: ");
			double radius = keyboard.nextDouble();
			System.out.println("The area is: " + multiple.format(num1.calcArea(radius)) + " square feet.");
			break;
		case 2: 
			System.out.println("Enter the Width: ");
			double width = keyboard.nextDouble();
			System.out.println("Enter the height: ");
			double height = keyboard.nextDouble();
			System.out.println("The area is: " + multiple.format(num1.calcArea(width, height, 0)) + " square feet");
			break;
		case 3:
			System.out.println("Enter the radius: ");
			radius = keyboard.nextDouble();
			System.out.println("Enter the Height: ");
			height = keyboard.nextDouble();
			System.out.println("The area is: " + multiple.format(num1.calcArea(radius, height)) + " square feet.");
		
			}
	}
}