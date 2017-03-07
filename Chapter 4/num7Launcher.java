import java.text.DecimalFormat;
import java.util.Scanner;

public class num7Launcher {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		fatGram fat = new fatGram();
		int cals = 0;
		int fatGr = 0;
		System.out.print("Enter the number of calories: ");
		cals = keyboard.nextInt();
		do{
		System.out.print("Enter number of fat grams: ");
		fatGr = keyboard.nextInt();
		}while(fatGr >= cals);
		fat.setCalories(cals);
		fat.setFatGram(fatGr);
		DecimalFormat percent = new DecimalFormat("#0%");
		System.out.print("The Perecnt of callories from fat is " +
		percent.format(fat.getpercent()) + " " + fat.getfat());
		keyboard.close();
		}
}
