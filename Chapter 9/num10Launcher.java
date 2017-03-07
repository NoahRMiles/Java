
public class num10Launcher {

	public static void main(String[] args) {
		num10Ship s1 = new num10Ship("Kraby Cruiser", "2005");
		num10CruiseShip s2 = new num10CruiseShip("Kraby Cruiser", "2005", 20);
		num10CargoShip s3 = new num10CargoShip("Kraby Cruiser", "2005", 20000);
		
		
		System.out.println(s1.toString());
		System.out.println("");
		System.out.println(s2.toString());
		System.out.println("");
		System.out.println(s3.toString());
		

	}

}
