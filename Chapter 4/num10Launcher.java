import java.util.Scanner;

public class num10Launcher {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		fAndBpoints temp = new fAndBpoints();
		//gets user input
		System.out.print("Enter a temperature ");
		temp.setDegree(keyboard.nextDouble());
		//displays output
			System.out.println("For " + temp.getDegree() + " Degrees:");
		// checks if each is true and displays
		if(temp.isEthylBoiling()){
			System.out.println("Ethyl Alcohol is Boiling");
		}
		if(temp.isEthylFreezing()){
			System.out.println("Ethyl Alcohol is Freezing");
		}
		if(temp.isOxygenBoiling()){
			System.out.println("Oxegen is Boiling");
		}
		if(temp.isOxygenFreezing()){
			System.out.println("Oxegen is Freezing");
		}
		if(temp.isWaterBoiling()){
			System.out.println("Water is Boiling");
		}
		if(temp.isWaterFreezing()){
			System.out.println("Water is Freezing");
		}
		keyboard.close();
	}
}
