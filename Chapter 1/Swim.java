
public class Swim {

	private boolean water;
	public Swim(boolean con) {
		this.water = con;
		if(con == true){
			System.out.println("The water is warm");
		}else {
			System.out.println("Water is cold");
		}
	}

	public static void main(String[] args) {
		Swim swim1 = new Swim(true);
		Swim swim2 = new Swim(false);

	}

}
