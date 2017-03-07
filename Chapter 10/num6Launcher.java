import java.io.IOException;

public class num6Launcher {
	public static void main(String[] args) throws IOException
	{
		int[] firstArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // first array
		int[] secondArray = new int[10];// second array
		
		System.out.print("Contents of first array: ");
		for(int i = 0; i < firstArray.length; i++)
		{
			System.out.print(firstArray[i] + " "); // prints out the array
		}
		System.out.println("\nWriting to contents of first array into File.dat...");
		num6FileArray.writeArray("File.dat", firstArray); // passes in the info 
		System.out.println("Reading contents of File.dat into second array...");
		num6FileArray.readArray("File.dat", secondArray); //passes in the second array =
		System.out.print("Contents of second array: ");
		
		for(int i = 0; i < secondArray.length; i++)
		{
			System.out.print(secondArray[i] + " "); // prints out he second array
		}
	}
}
