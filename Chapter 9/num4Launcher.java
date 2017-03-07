import java.util.Scanner;

public class num4Launcher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.print("Enter the Grammar Score: ");
		double grammar = keyboard.nextDouble(); // gets the grammar Score
		while (grammar < 0 || grammar > 30){//data validation
			System.out.print("Incorret data RE-");
			System.out.print("Enter the Grammar Score: ");
			grammar = keyboard.nextDouble();
		}
		System.out.print("Enter the Spelling Score: ");
		double spelling = keyboard.nextDouble();
		while(spelling < 0|| spelling > 20){
			System.out.print("Incorret data RE-");
			System.out.print("Enter the Spelling Score: ");
			spelling = keyboard.nextDouble();
		}
		System.out.print("Enter the Correct Length Score: ");
		double length = keyboard.nextDouble();
		while(length < 0|| length > 20){
			System.out.print("Incorret data RE-");
			System.out.print("Enter the Correct Length Score: ");
			length = keyboard.nextDouble();
		}
		System.out.print("Enter the Content Score: ");
		double content = keyboard.nextDouble();
		while( content < 0|| content > 30){
			System.out.print("Incorret data RE-");
			System.out.print("Enter the Content Score: ");
			content = keyboard.nextDouble();
		}
		
		//passes the users input into the class
		num4Essay p1 = new num4Essay(grammar, spelling, length, content);
		
		
		
		//output
		System.out.println("The Student earned a " + p1.getGrade());
		System.out.println("The Student's Score is " + p1.getScore());
		System.out.println("The Grammer Score is " + p1.getGrammar());
		System.out.println("The Spelling Score is " + p1.getSpelling());
		System.out.println("The Correct Length Score is " + p1.getCorrectLength());
		System.out.println("The Content Score is " + p1.getContent());
		
		
	}

}
