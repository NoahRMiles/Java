
public class num12CarInstraments {
	public static void main(String[] args) {
		num12FuelGuage p1 = new num12FuelGuage();
		num12Odometer p2 = new num12Odometer(p1);
		int i = 24;
		for(int x = 0; x <= 360; x++){
			if(p1.getFuel() <= 0){
				int y = 0;
				while(y <= 15.0){
					if(p1.getFuel() <= 15.0){
						p1.getFillUp();
						System.out.println("The curent fuel level is " + p1.getFuel());
					}
					y++;
				}
			}
			if(i == 24){
				System.out.println("The current Milage is " + p2.getMileage()+
				" The curent fuel level is " + p1.getFuel());
				i= 1;
			}else {
				i++;
			}
			p2.getAddMile();
			p2.getBurn();
		}
	}

}
