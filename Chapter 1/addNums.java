
public class addNums {

	private int num1, num2, results;
	
	public addNums(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		this.results = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = "+ results );
	}

	public static void main(String[] args) {
		addNums set1 = new addNums(1,2);
		addNums set2 = new addNums(2,3);
		addNums set3 = new addNums(3,4);
		addNums set4 = new addNums(4,5);
		addNums set5 = new addNums(5,6);

	}

}
