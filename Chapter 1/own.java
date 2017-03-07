
public class own {

	private boolean test;
	private int num1, num2;
	
	public own(boolean con, int num1, int num2) {
		this.test = con;
		this.num1 = num1;
		this.num2 = num2;
		String text;
		if(con == true){
			if((num1 + num2) < 10){
				text = "Bool true, number grater that 10";
			}else{
				text = "bool true numebr less than 10";
			}
		}else {
			text = "Bool false";
		}
		System.out.println(text);
	}

	public static void main(String[] args) {
		own test1 = new own(true, 1,2);
		own test2 = new own(true, 7,9);
		own test3 = new own(false, 1,2);
		

	}

}
