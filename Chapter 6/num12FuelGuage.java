
public class num12FuelGuage {
	private double fuel = 0;
	public num12FuelGuage() {
	// TODO Auto-generated constructor stub
	}

	public double getFillUp(){
		if(fuel < 15.00 ){
			fuel++;
		}
		return fuel;
	}
	public double getFuelLose(){
		if(fuel > 1){
			fuel--;
		}
		return fuel;
	}

	/**
	* @return the fuel
	*/
	public double getFuel() {
		return fuel;
	}

	/**
	* @param fuel the fuel to set
	*/
	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
}