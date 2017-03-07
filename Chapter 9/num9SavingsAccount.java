
public class num9SavingsAccount extends num9BankAccount {

	private boolean active;
	
	public num9SavingsAccount(double ball, double rate) {
		super(ball, rate);
		// TODO Auto-generated constructor stub
	}
	
	public void withdraw(double ball){
		if(isActive(ball) == true){
			withdraw(ball);
		}else {
			System.out.println("Not enough Mony in Acount");
		}
	}
	public void Deposit(double ball){
		if(isActive(ball) == true){
			deposit(ball);
		}else {
			System.out.println("Not enough Mony in Acount");
		}
	}

	/**
	 * @return the active
	 */
	public boolean isActive(double balance) {
		if (balance >= 25){
			active = true;
		}else {
			active  = false;
		}
		return active;
	}

}
