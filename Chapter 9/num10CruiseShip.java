
public class num10CruiseShip extends num10Ship {

	private int pasaengersNum;
	
	public num10CruiseShip(String name, String buildYear, int num) {
		super(name, buildYear);
		setPasaengersNum(num);
	}
	/**
	 * ToString method
	 */
	@Override
	public String toString(){
		String str = "";
		
		str = "Name: " + getName() + 
			  "\nNumber of Passengers: " + getPasaengersNum();
		
		return str;
	}
	/**
	 * @return the pasaengersNum
	 */
	public int getPasaengersNum() {
		return pasaengersNum;
	}
	/**
	 * @param pasaengersNum the pasaengersNum to set
	 */
	public void setPasaengersNum(int pasaengersNum) {
		this.pasaengersNum = pasaengersNum;
	}
	

}
