
public class num1TestScore {
	private double average;
	private double total;
	
	public num1TestScore(double[] scores){ // runns through the array 
		for(int i = 0; i < scores.length; i++){
			if(scores[i] < 0 || scores[i] > 100){ // checks to see if any are out of range
				//throw new IllegalArgumentException("The value is out of range");
				try {
					throw new num2InvalidTestScore(scores[i]);
				} catch (num2InvalidTestScore e) {
					e.getMessage(); // displays the message
				}
			}
			total += scores[i]; // adds up all the scores
		}
	}
	
	/**
	 * 
	 * @return average
	 */
	
	public double calcAvg(){
		
		double average = total / 4.0;// gets the average
		return average;
	}
}
