
public class num1 {

	public num1() {
		// TODO Auto-generated constructor stub
	}
	//three overloaded methods named Area, one for each shape, do their math accordingly
	public static double calcArea(double radius) {	
		return Math.PI * (radius * radius);	 
		}
			
	public static double calcArea(double width, double height, int s){
		return width * height;
		}
			
	public static double calcArea(double radius, double height){
		return Math.PI * (Math.pow(radius, 2) * height);
		}

}
