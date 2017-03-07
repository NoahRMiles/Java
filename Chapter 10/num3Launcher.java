import java.util.Scanner;

public class num3Launcher {
	public static void main(String[] args) {
		num3Retail item1 = new num3Retail("Item #1: Jacket", -12, 59.95); // passes in info
		num3Retail item2 = new num3Retail("Item #2: Designer Jeans", 40, -34.95); // passes in info
		num3Retail item3 = new num3Retail("Item #3: Shirt", 20, 24.95); // passes in info
		
		System.out.println("Description\t\t Units on Hand\t Price");
		System.out.println(item1.getDesc() + "\t\t\t" + item1.getUnits() + "\t" + item1.getPrice() + "\n"); // displays item 1
		System.out.println(item2.getDesc() + "\t\t" + item2.getUnits() + "\t" + item2.getPrice() + "\n"); // displays item 2
		System.out.println(item3.getDesc() + "\t\t\t" + item3.getUnits() + "\t" + item3.getPrice() + "\n"); // displays item 3
	}

}
