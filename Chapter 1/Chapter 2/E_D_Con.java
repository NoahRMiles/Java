
public class E_D_Con {

	public static void main(String[] args) {
		double people = 15000,
			   number = 0.58,
			   cit = 0.18,
			   citAVG,
			   peopAVG;
		
		peopAVG = people * number;
		citAVG = peopAVG * cit;
		
		System.out.printf("The number of coustomers who purchase one or more per week: %.2f\n"
				+ "			   Number who perfer citrus is %.2f", peopAVG, citAVG);

	}

}
