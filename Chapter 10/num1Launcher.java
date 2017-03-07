
public class num1Launcher {

	public static void main(String[] args) {

		double[] scores = {56.0, -75.0, 199.0, 78.0}; // array of scores
		num1TestScore p1 = new num1TestScore(scores); // passes the array int test scores
		
		System.out.println("Average: " + p1.calcAvg()); // prints out the avg
	}

}
