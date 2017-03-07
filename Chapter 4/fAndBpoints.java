
public class fAndBpoints {

	private double degree;
	
	public fAndBpoints() {
		// TODO Auto-generated constructor stub
	}
	/**
	* @return the degree
	*/
	public double getDegree() {
		return degree;
	}
	/**
	* @param degree the degree to set
	*/
	public void setDegree(double degree) {
		this.degree = degree;
	}
	/**
	* @param decides if Ethyl is Freezing
	*/
	public boolean isEthylFreezing(){
		boolean isFreeze = false;
		if (degree <= -173){
			isFreeze = true;
		}
		return isFreeze;
	}
	/**
	* @param decides if Oxygen is Freezing
	*/
	public boolean isOxygenFreezing(){
		boolean isFreeze = false;
		if (degree <= -362){
			isFreeze = true;
		}
		return isFreeze;
	}
	/**
	* @param decides if water is Freezing
	*/
	public boolean isWaterFreezing(){
		boolean isFreeze = false;
		if (degree <= 32){
			isFreeze = true;
		}
		return isFreeze;
	}
	/**
	* @param decides if Ethyl is Boiling
	*/
	public boolean isEthylBoiling(){
		boolean isBoil = false;
		if (degree >= 172){
			isBoil = true;
		}
		return isBoil;
	}
	/**
	* @param decides if Oxygen is Boiling
	*/
	public boolean isOxygenBoiling(){
		boolean isBoil = false;
		if (degree >= -306){
			isBoil = true;
		}
		return isBoil;
	}
	/**
	* @param decides if water is Boiling
	*/
	public boolean isWaterBoiling(){
		boolean isBoil = false;
		if (degree >= 212){
			isBoil = true;
		}
		return isBoil;
	}
}