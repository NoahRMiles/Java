import java.util.Scanner;

public class pet {

	private String type;
	private String name;
	private int age;
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		pet p1 = new pet();
		
		System.out.print("Enter the name: ");
		p1.setName(keyboard.next());
		System.out.println("Enter the type of pet: ");
		p1.setType(keyboard.next());
		System.out.print("Enter the age: ");
		p1.setAge(keyboard.nextInt());
		
		System.out.printf("Your %s, named %s is %d years old", p1.getType(), p1.getName(), p1.getAge());
		
	}
	public pet() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
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

	
}
