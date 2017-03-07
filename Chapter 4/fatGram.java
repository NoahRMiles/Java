
public class fatGram {
	private double caloFat;
	private double fatGram;
	private double calories;
	private String fat;
	private double percent;
	
	
	public fatGram() {
	// TODO Auto-generated constructor stub
	}
	
	/**
	* @return the percent
	*/
	public double getpercent() {
		this.caloFat = fatGram * 9;
		this.percent = caloFat / calories;
		return percent;
	}
	/**
	* @return the caloFat
	*/
	public String getfat() {
		if (percent < 0.30){
			fat = "The food is Low in fat";
		}else {
			fat = "";
		}
		return fat;
	}
	
	/**
	* @return the fatGram
	*/
	public double getFatGram() {
		return fatGram;
	}
	
	/**
	* @param fatGram the fatGram to set
	*/
	public void setFatGram(double fatGram) {
		this.fatGram = fatGram;
	}
	
	/**
	* @return the calories
	*/
	public double getCalories() {
		return calories;
	}
	
	/**
	* @param calories the calories to set
	*/
	public void setCalories(double calories) {
		this.calories = calories;
	}
}