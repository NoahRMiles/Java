import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class num6FileArray {
	public static void writeArray(String fileName, int[] array) throws IOException
	{
		FileOutputStream fstream = new FileOutputStream(fileName); // Creates binary file
		DataOutputStream outputFile = new DataOutputStream(fstream); // data writer
		
		for(int i = 0; i < array.length; i++)
		{
			outputFile.writeInt(array[i]); // adds the array to the binary file
		}
		
		outputFile.close(); // close file
	}
	
	public static void readArray(String fileName, int[] array) throws IOException
	{
		FileInputStream fstream = new FileInputStream(fileName); // opens the file
		DataInputStream inputFile = new DataInputStream(fstream); // reads the file 
		
		for(int i = 0; i < array.length; i++)
		{
			array[i] = inputFile.readInt(); // ads the contents of the file to an array
		}
		
		inputFile.close(); // closes the file
	}
}
