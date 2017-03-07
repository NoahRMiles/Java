import java.util.Scanner;

public class num4Launcher {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		
		num4Month p1 = new num4Month(40);
		num4Month p2 = new num4Month("Bobby");
	
		
		System.out.println("For the value 40, it will print out " + p1.toString());
		System.out.println("For the value Bobby, it will print out " + p2.toString());
		
	}

}
