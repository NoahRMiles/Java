import java.util.Scanner;

public class num2Launcher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);//Initiates the scanner object to get user input
		num2 num = new num2(); // calls the constructor
		int speed;// variable for speed
		int time;// variable for time
		do{
			System.out.println("Enter a speed above Zero");
			speed = keyboard.nextInt();// sets speed variable
		} while(speed < 0);// checks to make sure speed is good
		do{
			System.out.println("Enter the time in hours you are going ");
			time = keyboard.nextInt();// sets time variable
		}while(time < 0);// checks to make sure time is good
		num.setSpeed(speed);
		System.out.println("Hour\t\t Distance traveled");
		System.out.println("**********************************");
		for(int i = 1; i <= time; i++){
		num.setTime(i);// sets settime for each individual hour
		System.out.printf("%d\t\t\t %d\n", i , num.getdistance());// display the output
		}
	}

}
