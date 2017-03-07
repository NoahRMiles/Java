import java.util.Scanner;

public class circle {

	private double Radius;
	private double Area;
	private double Diameter;
	private double circumference;
	
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		circle p1 = new circle();
		
		System.out.print("Enter A radius for a circle: ");
		double radius = keyboard.nextDouble();
		
		p1.setRadius(radius);
		
		System.out.printf("Area: %.4f\n", p1.getArea());
		System.out.printf("Diameter: %.4f\n", p1.getDiameter());
		System.out.printf("Circumference: %.4f\n", p1.getCircumference());

	}
	public circle() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the radius
	 */
	public double getRadius() {
		return Radius;
	}
	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		Radius = radius;
	}
	/**
	 * @return the area
	 */
	public double getArea() {
		return Math.PI * Radius * Radius;
	}
	/**
	 * @return the diameter
	 */
	public double getDiameter() {
		return Radius * 2;
	}
	/**
	 * @return the circumference
	 */
	public double getCircumference() {
		return 2 * Math.PI * Radius;
	}

	

}
