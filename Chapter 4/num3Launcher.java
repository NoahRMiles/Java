import java.util.Scanner;

public class num3Launcher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		testScores test = new testScores();
		
		for(int i = 0; i < 3; i++){
			System.out.print("Enter a test score: ");
			test.setScore(keyboard.nextDouble());
		}
		System.out.printf("The average of the test scores is: %.2f, your letter grade is %s", test.getAVG(), test.getLetterGrade());

	}

}
