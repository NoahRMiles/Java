import java.util.Scanner;

public class testScores {

	private double scores;
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		testScores test = new testScores();
		
		for(int i = 0; i < 3; i++){
			System.out.print("Enter a test score: ");
			test.setScores(keyboard.nextDouble());
		}
		System.out.printf("The average of the test scores is: %.2f", test.getScores());

	}
	public testScores() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the scores
	 */
	public double getScores() {
		return scores / 3;
	}
	/**
	 * @param scores the scores to set
	 */
	public void setScores(double scores) {
		this.scores += scores;
	}


}
