import java.util.Scanner;

public class personalInfo {

	private String name;
	private String address;
	private int age;
	private String phoneNumber;
	
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		personalInfo[] person = new personalInfo[3];
		for(int i = 0; i < person.length; i++){
			person[i] = new personalInfo();
			System.out.print("Enter name for person: ");
			String name = keyboard.next();
			person[i].setName(name);
			System.out.printf("Enter the age for %s: ", name);
			int num = keyboard.nextInt();
			person[i].setAge(num);
			System.out.printf("The ter the address for %s", name);
			String add = keyboard.next();
			person[i].setAddress(add);
			System.out.printf("Enter the phone number for %s", name);
			String phone = keyboard.next();
			person[i].setPhoneNumber(phone);
		}
		
		for(int i = 0; i < person.length; i++){
			System.out.printf("Name: %s,\t Age: %s,\t Address: %s,\t Phone Number: %s\n", 
						person[i].getName(), person[i].getAge(), person[i].getAddress(), person[i].getPhoneNumber());
		}
	}

	
	public personalInfo() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}


	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
}
