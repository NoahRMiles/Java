
public class num3NegativePrice extends Exception{
	public num3NegativePrice(double price) {
		System.out.println("Error: Bad price for " + price); // message for if the price is wrong
	}
}