import java.io.IOException;

public class num7_8Launcher {
	public static void main(String[] args) throws IOException
	{
		int[] firstArray = { 10, 31, 40, 22, 5 }; // first array
		int[] secondArray = new int[5]; // second array 
		
		
		System.out.println("Encrypting Data"); 
		num6FileArray.writeArray("Encrypt.dat", firstArray);// passes the data into the encrypter
		System.out.println("Decrypting");
		num6FileArray.readArray("Encrypt.dat", secondArray); // gets the data after decryption
		System.out.print("Your passcode: ");
		
		for(int i = 0; i < secondArray.length; i++)
		{
			System.out.print(secondArray[i] + " ");// displays the pass code
		}
	}
}
