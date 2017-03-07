import java.text.DecimalFormat;
import java.util.Scanner;

public class num5Launcher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		num5 hotel = new num5();
		//local variables for math
			double rooms = 0;
			double floors = 0;
			double occupiedRooms = 0;
			double totalOccupied = 0;
			double totalRooms = 0;
			
			
			//get input from user
			System.out.println("How many floors does the hotel have?");
			floors = keyboard.nextDouble();
			while(floors < 1){
				System.out.println("Re-Enter How many floors does the hotel have?");
				floors = keyboard.nextDouble();
			}
			
			
			//loop for entering the number of floors and rooms. Then it loops for how many rooms are vacant and filled for each floor
			for(int number = 1; number <= floors; number++){
				System.out.println("How many rooms are on floor " + number + ": ");
				rooms = keyboard.nextDouble();
				keyboard.nextLine();
				while(rooms < 10){
					System.out.println("You have entered an invalid number. Please try again.");
					rooms = keyboard.nextDouble();
				}
				
				System.out.println("How many rooms on floor " + number + " are filled?");
				occupiedRooms = keyboard.nextDouble();
				while(occupiedRooms < 0 || occupiedRooms > rooms){
					System.out.println("You have entered an invalid value. Please try again.");
					occupiedRooms = keyboard.nextDouble();
				}
				
				//setting the occupied, total, and vacant rooms to add together each time it loops
				totalOccupied += occupiedRooms;
				totalRooms += rooms;
				
				}
			
			//show output formatted by decimal format
			hotel.setRooms(totalRooms);
			hotel.setOccupied(totalOccupied);
			DecimalFormat percent = new DecimalFormat("#0.00%");
			System.out.println("There are " + floors + " floors in the hotel");
			System.out.println("the hotel has a total of " + totalRooms + " rooms");
			System.out.println("						 " + totalOccupied + " are occupied");
			System.out.println("The occupancy rate is: " + percent.format(hotel.getOccupancyRate()));
			
			}
	}
