public class num4GradedActivity {

	private double score;// numeric score
	
	/**
	 * @return the score
	 */
	public double getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(double score) {
		this.score = score;
	}
	
	/**
	 * The getGrade method returns a letter grade
	 * Determined from the score field
	 */
	public char getGrade(){
		char letterGrade; //To hold the grade
		if(score >=90){
			letterGrade = 'A';
		}else if (score >= 80){
			letterGrade = 'B';
		} else if (score >= 70){
			letterGrade = 'C';
		} else if (score >= 60){
			letterGrade = 'D';
		}else {
			letterGrade = 'F';
		}
		return letterGrade;
	}
}
