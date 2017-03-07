import java.util.Scanner;

public class test_Average {

	public static void main(String[] args) {
		double test1;
		double test2;
		double test3;
		double total;
		double avg;
		
		Scanner keyboard = new Scanner(System.in);
		
			System.out.printf("Enter the score for test %d: ", 1);
			test1 = keyboard.nextDouble();
			System.out.printf("Enter the score for test %d: ", 2);
			test2 = keyboard.nextDouble();
			System.out.printf("Enter the score for test %d: ", 3);
			test3 = keyboard.nextDouble();
			
			total = test1 + test2 + test3;
			
			avg = total / 3;
			
			System.out.printf("The average of the tests is %.2f", avg);
		
	}

}
