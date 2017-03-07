
public class num5 {

	private double rooms;
	private double occupied;
	private double OccupancyRate;
	
	public num5() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the rooms
	 */
	public double getRooms() {
		return rooms;
	}

	/**
	 * @param rooms the rooms to set
	 */
	public void setRooms(double rooms) {
		this.rooms = rooms;
	}

	/**
	 * @return the occupied
	 */
	public double getOccupied() {
		return occupied;
	}

	/**
	 * @param occupied the occupied to set
	 */
	public void setOccupied(double occupied) {
		this.occupied = occupied;
	}

	/**
	 * @return the occupancyRate
	 */
	public double getOccupancyRate() {
		OccupancyRate = occupied / rooms;
		return OccupancyRate;
	}

	

}
