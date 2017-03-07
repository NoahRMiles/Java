
public class num7Launcher {

	public static void main(String[] args) {
		num7Customer p1 = new num7Customer();
		p1.setName("Bob Tomas");
		p1.setAddress("1234 Hello ln.");
		p1.setPhone("(123) 456-7890");
		p1.setCustNum(7410);
		p1.setMail(true);
		
		System.out.print(p1.toString());
	}

}
