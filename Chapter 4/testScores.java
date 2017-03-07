
public class testScores {

	private double score;
	private String letterGrade;
	private double AVG;
	
	public testScores() {
		// TODO Auto-generated constructor stub
	}

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
		this.score += score;
	}

	/**
	 * @return the letterGrade
	 */
	public String getLetterGrade() {
		if (score > 89){
			letterGrade = "A";
		}else if(score > 79){
			letterGrade = "B";
		}
		else if(score > 69){
			letterGrade = "C";
		}else if(score > 79){
			letterGrade = "D";
		}else{
			letterGrade = "F";
		}
		return letterGrade;
	}

	/**
	 * @return the aVG
	 */
	public double getAVG() {
		this.AVG = score / 3;
		return AVG;
	}

	
}
