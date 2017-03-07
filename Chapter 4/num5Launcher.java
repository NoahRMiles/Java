import java.text.DecimalFormat;
import java.util.Scanner;

public class num5Launcher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		bankCharges bank = new bankCharges();
		double checkTotal = 0;
		System.out.print("Enter your Balance: ");
		bank.setBalance(keyboard.nextDouble());
		System.out.print("How many checks are you cashing");
		int checkNum = keyboard.nextInt();
		for (int i = 1; i <= checkNum; ++i){
		System.out.print("Enter Ammount for check " + i + ": ");
		checkTotal += keyboard.nextDouble();
		}
		bank.setCheckNum(checkNum);
		bank.setCheckTotal(checkTotal);
		DecimalFormat money = new DecimalFormat("$#,##0.00");
		System.out.print("The Total amount for cashed checks is " +
		money.format(bank.getCheckTotal()) + ", Your Service Fees for cashing the check is "+
		money.format(bank.getCheckFee()) + ", Your balence is " +
		money.format(bank.getBalance())   );
		keyboard.close();
		}

}
