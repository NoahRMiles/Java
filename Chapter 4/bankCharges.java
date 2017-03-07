
	public class bankCharges {
	
	private int checkNum;
	private double Balance;
	private double checkTotal;
	private double checkFee;
	
	
	public bankCharges() {
	// TODO Auto-generated constructor stub
	}
	
	/**
	* @return the checkTotal
	*/
	public double getCheckTotal() {
		return checkTotal;
	}
	
	/**
	* @param checkTotal the checkTotal to set
	*/
	public void setCheckTotal(double checkTotal) {
		this.checkTotal = checkTotal;
	}
	
	/**
	* @return the checkNum
	*/
	public int getCheckNum() {
		return checkNum;
	}
	
	/**
	* @param checkNum the checkNum to set
	*/
	public void setCheckNum(int checkNum) {
		this.checkNum = checkNum;
	}
	
	/**
	* @return the checkFee
	*/
	public double getCheckFee() {
		if (checkNum < 20){
			this.checkFee = 0.10 * checkNum;
		} else if (checkNum >= 20 && checkNum < 40){
			this.checkFee = 0.08 * checkNum;
		}else if (checkNum >= 40 && checkNum < 60){
			this.checkFee = 0.06 * checkNum;
		}else {
			this.checkFee = 0.04 * checkNum;
		}
		if(Balance < 400.00){
			checkFee += 15;
		}
		return checkFee;
	}
	
	
	/**
	* @return the balance
	*/
	public double getBalance() {
		return Balance - checkFee + checkTotal;
	}
	
	/**
	* @param balance the balance to set
	*/
	public void setBalance(double balance) {
		Balance = balance;
	}
}