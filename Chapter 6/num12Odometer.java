
public class num12Odometer {
	private double mileage = 0;
	private num12FuelGuage useage;
	public num12Odometer() {
	// TODO Auto-generated constructor stub
	}
	public num12Odometer(num12FuelGuage useage) {
		this.useage = useage;
	}

	public double getAddMile(){
		if(mileage > 999999){
			mileage = 0;
		} else {
			mileage++;
		}
		return mileage;
	}
	public void getBurn(){
		if ((mileage % 24) == 0){
			double total;
			total = useage.getFuel() - 1;
			useage.setFuel(total);
		}
	}
	/**
	* @return the mileage
	*/
	public double getMileage() {
		return mileage;
	}

}