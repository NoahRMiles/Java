import java.util.Scanner;

public class num10Launcher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] array = new int[5];
		for(int i = 0; i < array.length; i++){
			System.out.print("Enter a number between 1-10: ");
			array[i] = keyboard.nextInt();
		}
		
		num10Lotto p1 = new num10Lotto(array);
		System.out.println("Your Numbers: ");
		for(int i = 0; i < 5; i++){
			System.out.print(" " + p1.getUserArray()[i]);
		}
		System.out.print("\n");
		System.out.println("Lotto Numbers: ");
		for(int i = 0; i < 5; i++){
			System.out.print(" " + p1.getLottoNum()[i]);
		}
		System.out.print("\n");
		
		if(p1.getNumCorrect() == 5){
			System.out.println("You go 5 of 5 correct you win the Grand Prize");
		}else {
			System.out.println("You got " + p1.getNumCorrect() + " correct");
		}

	}

}
