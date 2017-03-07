import java.util.Scanner;

public class num5Launcher {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		//input variables
		String name; // name
		int Id;// id
		double payRate; // payrate
		double hours; // hours
		double grossPay; // grosspay
		String empty = ""; // empty string
		
		//get input
		System.out.println("What is your name? ");
		name = keyboard.nextLine(); //sets name
		System.out.println("What is your ID Number? ");
		Id = keyboard.nextInt(); // sets id
		System.out.println("What is your pay rate? ");
		payRate = keyboard.nextDouble();// sets pay rate
		System.out.println("How many hours did you work? ");
		hours = keyboard.nextDouble(); // sets hours
		
		//show math
		grossPay = payRate * hours;
		
		//instantiate object
		num5payroll employee1 = new num5payroll(name, Id, payRate, hours);
		//show output
		if(name.equals(empty)){ // tests name
			try {
				throw new num5ErrorString(); // error 
			} catch (num5ErrorString e) {
				e.getMessage(); // message
			}
		}else {
			System.out.println("Name: " + employee1.getName()); // prints out name
		}
		if(Id < 1){ // test id
			try {
				throw new num5IDString(); //error
			} catch (num5IDString e) {
				e.getMessage(); // message
			}
		}else {
			System.out.println("ID: " + employee1.getId()); // prints out id
		}
		if(hours < 0 || hours > 84){ // tests hours
			try {
				throw new num5HoursError();//error
			} catch (num5HoursError e) {
				e.getMessage();//message
			}
		}else{
			System.out.println("Hours worked: " + employee1.getHours()); // prints out hours
		}
		if(payRate < 0 || payRate > 25){ // tests pay rate
			try {
				throw new num5PayError(); // error
			} catch (num5PayError e) {
				e.getMessage(); // message
			}
		}else {
			System.out.println("Pay Rate: " + employee1.getPayRate()); // prints out pay rate
		}
		
		System.out.println("Gross Pay: $" + grossPay);// prints out gross pay
		
		
	}

}
