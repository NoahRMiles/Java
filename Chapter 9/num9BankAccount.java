
public abstract class num9BankAccount {

	private double balance;
	private int deposits;
	private int withdrawals;
	private double intrestRate;
	private double serviceCharge;
	public num9BankAccount(double ball, double rate) {
		this.balance = ball;
		this.intrestRate = rate;
	}
	public void deposit(double amount){
		balance += amount;
		deposits ++; 
	}
	public void withdraw(double amount){
		balance -= amount;
		withdrawals ++; 
	}
	public void calcIntrest(){
		 double monthlyRate = (intrestRate/ 12);
		 double monthlyIntrest = balance *  monthlyRate;
		 balance = balance + monthlyIntrest;
	}
	public void monthlyProcess(double serviceCharge){
		balance = balance - serviceCharge;
		calcIntrest();
		deposits = 0;
		withdrawals = 0;
		serviceCharge = 0;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

}
