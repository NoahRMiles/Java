import java.text.DecimalFormat;
import java.util.Scanner;

public class num6Launcher {
	public static void main(String[] args) {
		//initiates the Scanner
		Scanner keyboard = new Scanner(System.in);
		//initiates the constructor
		num6 population = new num6();
		int startPop = 0; // starting population
		double percentIncrease = 0; // percent increase
		int days = 0; // number of days
		//gets startPop
		System.out.print("Enter the starting Population: ");
		startPop = keyboard.nextInt();// sets the starting population
		while (startPop < 2){//validation
		System.out.print("Invalid Data Re-Enter the starting Population: ");
		startPop = keyboard.nextInt();
		}
		population.setStartPop(startPop);// calls the SetStartPop sets start pop
		population.setDailyPop(startPop);//cals the setDailyPop
		//gets Percent Increase
		System.out.print("Enter the percentage Increase for the Population ");
		percentIncrease = keyboard.nextDouble();// sets the percent increase
		while (percentIncrease < 0 ){//validator
		System.out.print("Invalid Data RE-Enter the percentage Increase for the Population ");
		percentIncrease = keyboard.nextDouble();
		}
		percentIncrease = percentIncrease /100;// sets percent to a decimal
		population.setPercentIncrease(percentIncrease);// calls the setPercent Increase
		//gets num of days
		System.out.print("Enter the number of days the Population will multipy ");
		days = keyboard.nextInt();// sets the number of days
		while(days < 1){//validation
		System.out.print("Invalid Data Re-Enter the number of days the Population will multipy ");
		days = keyboard.nextInt();
		}
		population.setDay(days);//calls setDay
		DecimalFormat single = new DecimalFormat("#,##0");// decimal formating to add commas
		for(int i  = 1; i <=population.getDay(); ++i){
		//prints out the output
		System.out.println("Day "+ i +", the population is "+
		single.format(population.getDailyPop()));
		}

		}
}
