import java.util.Scanner;

public class num4Launcher {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double length;
		double width;
		System.out.println("Enter the length of the track 1: ");
		length = keyboard.nextDouble();
		System.out.println("Enter the Width of the track 1: ");
		width = keyboard.nextDouble();
		num4LandTrack p1 = new num4LandTrack(length, width);
		System.out.println("Enter the length of the track 2: ");
		length = keyboard.nextDouble();
		System.out.println("Enter the Width of the track 2: ");
		width = keyboard.nextDouble();
		num4LandTrack p2 = new num4LandTrack(length, width);
		System.out.println(p1.toString());
		System.out.println( p2.toString());
		if(p1.equals(p2)){
			System.out.println("Track 1 and Track 2 are equal");
		} else {
			System.out.println("Track 1 and Track 2 are not equal");
		}
}

}