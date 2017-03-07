
public class num3Retail {
	private String description; //description
	private int unitsOnHand; // units on hand
	private double price; // price
	
	public num3Retail(String description, int unitsOnHand, double price) {
		// TODO Auto-generated constructor stub
		setDesc(description); // sets description
		setUnits(unitsOnHand); // sets units on hand
		setPrice(price); // sets price
		 if (unitsOnHand < 0){ // checks to see 
			 try {
					throw new num3NegativeUnit(unitsOnHand); // throws an error
				} catch (num3NegativeUnit e) {
					e.getMessage(); // displays the message
				}
		 }
		 if (price < 0){
			 try {
					throw new num3NegativePrice(price); // throws an error
				} catch (num3NegativePrice e) {
					e.getMessage(); // displays the message
				}
		 }
		
	}

	/**
	 * @return the description
	 */
	public String getDesc() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDesc(String description) {
		this.description = description;
	}

	/**
	 * @return the unitsOnHand
	 */
	public int getUnits() {
		return unitsOnHand;
	}

	/**
	 * @param unitsOnHand the unitsOnHand to set
	 */
	public void setUnits(int unitsOnHand) {
		this.unitsOnHand = unitsOnHand;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	

}
