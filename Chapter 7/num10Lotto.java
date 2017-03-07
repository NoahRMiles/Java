import java.util.Random;

public class num10Lotto {

	private int[] lottoArray = {1,2,3,4,5,6,7,8,9,10};
	private int[] userArray = new int[5];
	private int[] LottoNum = new int[5];
	private int numCorrect = 0;
	
	public num10Lotto() {
		// TODO Auto-generated constructor stub
	}
	public num10Lotto(int[] array) {
		this.userArray = array;
		isMatch();
	}
	
	public void isMatch(){
		Random rand = new Random();
		
		int n1 = rand.nextInt(10);
		int n2 = rand.nextInt(10);
		int n3 = rand.nextInt(10);
		int n4 = rand.nextInt(10);
		int n5 = rand.nextInt(10);
		
		LottoNum[0] = lottoArray[n1];
		LottoNum[1] = lottoArray[n2];
		LottoNum[2] = lottoArray[n3];
		LottoNum[3] = lottoArray[n4];
		LottoNum[4] = lottoArray[n5];
		
		if(lottoArray[n1] == userArray[0]){
			setNumCorrect();
		}
		if(lottoArray[n2] == userArray[1]){
			setNumCorrect();
		}
		if(lottoArray[n3] == userArray[2]){
			setNumCorrect();
		}
		if(lottoArray[n4] == userArray[3]){
			setNumCorrect();
		}
		if(lottoArray[n5] == userArray[4]){
			setNumCorrect();
		}
	}
	/**
	 * @return the numCorrect
	 */
	public int getNumCorrect() {
		return numCorrect;
	}
	/**
	 * @param numCorrect the numCorrect to set
	 */
	public void setNumCorrect() {
		this.numCorrect++;
	}
	/**
	 * @return the userArray
	 */
	public int[] getUserArray() {
		return userArray;
	}
	/**
	 * @return the lottoNum
	 */
	public int[] getLottoNum() {
		return LottoNum;
	}
	
	

}
