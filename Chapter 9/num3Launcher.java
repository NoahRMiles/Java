import java.util.Scanner;

public class num3Launcher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		num3TeamLeader p1 = new num3TeamLeader();
		
		System.out.print("Enter the Employee Name: ");
		String name = keyboard.nextLine();
		System.out.print("Enter the employee ID: ");
		String id = keyboard.nextLine();
		System.out.print("Enther the Hire Date for "+ name +": ");
		String date = keyboard.nextLine();
		System.out.print("Enter the Shift: 1 for day,"
				+ "						   2 for night: ");
		int shift = keyboard.nextInt();
		System.out.print("Enter the Hourly Rate");
		double rate = keyboard.nextDouble();
		System.out.print("Enter the team leader monthy bonus: ");
		double bonus = keyboard.nextDouble();
		System.out.print("Enter training hours: ");
		double hours = keyboard.nextDouble();
		
		p1.setName(name);
		p1.setEmpNum(id);
		p1.setHireDate(date);
		p1.setShift(shift);
		p1.setHourRate(rate);
		p1.setFixedBonus(bonus);
		p1.setTraininghours(hours);
		
		
		System.out.println("Name: " + p1.getName());
		System.out.println("Employee Id: " + p1.getEmpNum());
		System.out.println("Hire Date: " + p1.getHireDate());
		if(p1.getShift() == 1){
			System.out.println("Shift: Day");
		} else {
			System.out.println("Shift: night");
		}
		System.out.println("Pay Rate: " + p1.getHourRate());
		System.out.println("Your Fixed bonus: $" + p1.getFixedBonus());
		System.out.println("Training hours: " + p1.getTraininghours());

	}

}
