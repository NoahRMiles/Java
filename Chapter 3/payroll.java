import java.util.Scanner;

public class payroll {

	private int idNumber;
	private double payRate;
	private double hours;
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		payroll person = new payroll();
		System.out.print("Enter the id Number: ");
		int idnum = keyboard.nextInt();
		person.setIdNumber(idnum);
		System.out.print("Enter the hourly rate: ");
		double pay = keyboard.nextDouble();
		person.setPayRate(pay);
		System.out.print("Enter hours: ");
		double hour = keyboard.nextDouble();
		person.setHours(hour);
		
		System.out.printf("ID Number: %d, HourlyRate: %.2f, Hours: %.2f, Total Pay: %.2f", 
				person.getIdNumber(), person.getPayRate(), person.getHours(), person.getTotal());

	}
	
	public payroll() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the idNumber
	 */
	public int getIdNumber() {
		return idNumber;
	}

	/**
	 * @param idNumber the idNumber to set
	 */
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	/**
	 * @return the payRate
	 */
	public double getPayRate() {
		return payRate;
	}

	/**
	 * @param payRate the payRate to set
	 */
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	/**
	 * @return the hours
	 */
	public double getHours() {
		return hours;
	}

	/**
	 * @param hours the hours to set
	 */
	public void setHours(double hours) {
		this.hours = hours;
	}

	/**
	 * @return the totalPay
	 */
	public double getTotal() {
		return payRate * hours;
	}

}
