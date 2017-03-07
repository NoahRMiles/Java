
public class num6 {
	private double startPop; //starting Population
	private double percentIncrease; // percent of increase
	private double day; // number of days
	private double dailyPop; //daily population
	/**
	* Default constructor
	*/
	public num6() {
		// TODO Auto-generated constructor stub
	}
	/**
	* @return the startPop
	*/
	public double getDailyPop() {
		dailyPop = dailyPop + (percentIncrease * dailyPop ) ;
		return dailyPop;
	}
	/**
	* @param dailyPop the dailyPop to set
	*/
	public void setDailyPop(double dailyPop) {
		this.dailyPop = dailyPop;
	}
	/**
	* @return the startPop
	*/
	public double getStartPop() {
		return startPop;
	}

	/**
	* @param startPop the startPop to set
	*/
	public void setStartPop(double startPop) {
		this.startPop = startPop;

	}

	/**
	* @return the percentIncrease
	*/
	public double getPercentIncrease() {
		return percentIncrease;
	}

	/**
	* @param percentIncrease the percentIncrease to set
	*/
	public void setPercentIncrease(double percentIncrease) {
		this.percentIncrease = percentIncrease;
	}

	/**
	* @return the day
	*/
	public double getDay() {
		return day;
	}

	/**
	* @param day the day to set
	*/
	public void setDay(double day) {
		this.day = day;
	}
	
}