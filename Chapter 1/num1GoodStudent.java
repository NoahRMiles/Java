
public class num1GoodStudent {

	String name;
	public static void main(String[] args){
		num1GoodStudent student1 = new num1GoodStudent("Tom");
		num1GoodStudent student2 = new num1GoodStudent("Bob");
		num1GoodStudent student3 = new num1GoodStudent("Joe");
		num1GoodStudent student4 = new num1GoodStudent("Tim");
		
	}
	
	public num1GoodStudent(String n) {
		this.name = n;
		System.out.println("Welcome, "+ name + ", You are a good student"); 
	}

}
