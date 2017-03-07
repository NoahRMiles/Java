
public class runningRace {
	private String runner1;
	private String runner2;
	private String runner3;
	
	private double time1;
	private double time2;
	private double time3;
	
	public void runningRace(){
		
	}
	/***
	 * return order
	 */
	public String getOrder(){
		String first = "",
			   second = "",
			   third = "";
		
		if(time1 < time2 && time1 < time3){
			
			if(time2 < time3){
				second = runner2;
				third = runner3;
			}else {
				second = runner3;
				third = runner2;
			}
			
			first  = runner1;
		}else if(time2 < time1 && time2 < time3){
			
			if(time1 < time3){
				second = runner1;
				third = runner3;
			}else {
				second = runner3;
				third = runner1;
			}
			
			first  = runner2;
		}else if(time3 < time1 && time3 < time2){
			
			if(time1 < time2){
				second = runner1;
				third = runner2;
			}else {
				second = runner2;
				third = runner1;
			}
			
			first  = runner3;
		}
		
	
		return "1st place: " + first+ 
				"\n2nd place: " + second + 
				"\n3rd place: " + third;
	}
	/**
	 * @return the runner1
	 */
	public String getRunner1() {
		return runner1;
	}
	/**
	 * @param runner1 the runner1 to set
	 */
	public void setRunner1(String runner1) {
		this.runner1 = runner1;
	}
	/**
	 * @return the runner2
	 */
	public String getRunner2() {
		return runner2;
	}
	/**
	 * @param runner2 the runner2 to set
	 */
	public void setRunner2(String runner2) {
		this.runner2 = runner2;
	}
	/**
	 * @return the runner3
	 */
	public String getRunner3() {
		return runner3;
	}
	/**
	 * @param runner3 the runner3 to set
	 */
	public void setRunner3(String runner3) {
		this.runner3 = runner3;
	}
	/**
	 * @return the time1
	 */
	public double getTime1() {
		return time1;
	}
	/**
	 * @param time1 the time1 to set
	 */
	public void setTime1(double time1) {
		this.time1 = time1;
	}
	/**
	 * @return the time2
	 */
	public double getTime2() {
		return time2;
	}
	/**
	 * @param time2 the time2 to set
	 */
	public void setTime2(double time2) {
		this.time2 = time2;
	}
	/**
	 * @return the time3
	 */
	public double getTime3() {
		return time3;
	}
	/**
	 * @param time3 the time3 to set
	 */
	public void setTime3(double time3) {
		this.time3 = time3;
	}
}
