
public class num10CargoShip extends num10Ship {

	private int cargoCap;
	
	public num10CargoShip(String name, String buildYear, int cargo) {
		super(name, buildYear);
		setCargoCap(cargo);
	}
	/**
	 * ToString method
	 */
	@Override
	public String toString(){
		String str = "";
		
		str = "Name: " + getName() + 
			  "\nCargo Capacity: " + getCargoCap();
		
		return str;
	}
	/**
	 * @return the cargoCap
	 */
	public int getCargoCap() {
		return cargoCap;
	}
	/**
	 * @param cargoCap the cargoCap to set
	 */
	public void setCargoCap(int cargoCap) {
		this.cargoCap = cargoCap;
	}
	
}
