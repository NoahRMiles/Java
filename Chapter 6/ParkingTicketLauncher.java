
public class ParkingTicketLauncher {
	public static void main(String[] args) {
		ParkedCar car = new ParkedCar("Mazda", "Mazda 3", "NMILES", 185);
		ParkingMeter meter = new ParkingMeter(30);
		PoliceOfficer officer1 = new PoliceOfficer("PoPo Bob", 11326);
		ParkingTicket ticket = new ParkingTicket(meter, car, officer1);
		PoliceOfficer officer2 = new PoliceOfficer(officer1, car, meter, ticket);
		officer2.examineCar();
		

	}
}
