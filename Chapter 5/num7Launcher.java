import java.text.DecimalFormat;
import java.util.Scanner;

public class num7Launcher {
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	num7 rain = new num7();
	int years; // years
	System.out.print("How many years are you calculating: ");
	years = keyboard.nextInt(); // sets years
	while(years < 1){
	System.out.print("Invalid data; RE-Enter the amount of years are you calculating: ");
	years = keyboard.nextInt();
	}
	rain.setYears(years);
	rain.setAvg(0);
	DecimalFormat multiple = new DecimalFormat("#,##0.00");
	System.out.println("For " + years + " year the average rainfall is " +
	multiple.format(rain.getAvg()));

	}
}
