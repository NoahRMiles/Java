
public class num2 {
	private int speed; // private filed for speed
	private int time;// private filed for time
	public num2() {
	//default constructor
	}
	/**
	* @return the distance
	*/
	public int getdistance() {
		return speed * time;
	}
	/**
	* @return the speed
	*/
	public int getSpeed() {
		return speed;
	}
	/**
	* @param speed the speed to set
	*/
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	/**
	* @return the time
	*/
	public int getTime() {
		return time;
	}
	/**
	* @param time the time to set
	*/
	public void setTime(int time) {
		this.time = time;
	}

}
