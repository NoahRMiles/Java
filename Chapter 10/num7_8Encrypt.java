import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class num7_8Encrypt {
	public static void EncryptArray(String fileName, int[] array) throws IOException
	{
		FileOutputStream fstream = new FileOutputStream(fileName); // Creates binary file
		DataOutputStream outputFile = new DataOutputStream(fstream); // data writer
		
		for(int i = 0; i < array.length; i++)
		{
			outputFile.writeInt(2 + 40 * array[i]); // encrypts the array ass it passes into the binary file
		}
		
		outputFile.close(); // closes the file
	}
	
	public static void readArray(String fileName, int[] array) throws IOException
	{
		FileInputStream fstream = new FileInputStream(fileName); // opens the file
		DataInputStream inputFile = new DataInputStream(fstream); // reads the file 
		
		
		for(int i = 0; i < array.length; i++)
		{
			array[i] = inputFile.readInt();// reads from the array
			array[i] = array[i] / 40 - 2; // decrypts the pass code
		}
		
		inputFile.close(); // closes the file
	}
}
