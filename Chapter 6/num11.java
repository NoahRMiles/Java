import java.text.DecimalFormat;
import java.util.Scanner;

public class num11 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		final double Half = 0.5;
		int choice;
		do{
			System.out.println("Geometry Calculator: \n"
						+ "1. Calculate the Area of a Circle\n"
						+ "2. Calculate the Area of a Rectangle\n"
						+ "3. Calculate the Area of a Triangle\n"
						+ "4. Quit");
			choice = keyboard.nextInt();
			  while(choice < 1 || choice > 4){
				System.out.println("Incorect Data Re-Enter your choice: \n"
						+ "1. Calculate the Area of a Circle\n"
						+ "2. Calculate the Area of a Rectangle\n"
						+ "3. Calculate the Area of a Triangle\n"
						+ "4. Quit");
				choice = keyboard.nextInt();
			}
			DecimalFormat multiple = new DecimalFormat("#,##0.000");
			switch (choice){
				case 1:
					System.out.print("Enter the radius");
					double radius = keyboard.nextDouble();
					System.out.println("The Area is: " +
					multiple.format(Geometry.calcArea(radius)));
					break;
				case 2:
					System.out.print("Enter the Length: ");
					double length = keyboard.nextDouble();
					System.out.print("Enter the Width");
					double width = keyboard.nextDouble();
					System.out.println("The Area is: " +
					multiple.format(Geometry.calcArea(length, width)));
					break;
				case 3:
					System.out.print("Enter the Base: ");
					double base = keyboard.nextDouble();
					System.out.print("Enter the Height");
					double height = keyboard.nextDouble();
					System.out.println("The Area is: " +
					multiple.format(Geometry.calcArea(base , height ,Half)));
					break;
				case 4:
					System.out.println("Thanks please run again");
			 }
		} while(choice != 4);
	}
}