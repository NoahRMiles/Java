
public class num7Customer extends num7Person {

	private int custNum;
	private boolean mail;
	public num7Customer() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the custNum
	 */
	public int getCustNum() {
		return custNum;
	}
	/**
	 * @param custNum the custNum to set
	 */
	public void setCustNum(int custNum) {
		this.custNum = custNum;
	}
	/**
	 * @return the mail
	 */
	public boolean isMail() {
		return mail;
	}
	/**
	 * @param mail the mail to set
	 */
	public void setMail(boolean mail) {
		this.mail = mail;
	}

	public String toString(){
		String str = "";
		str = "Name: " + getName() + 
			  "\nAddress: " + getAddress() + 
			  "\nPhone Number: " + getPhone() + 
			  "\nCustomer Number: " + getCustNum()+ 
			  "\nMailing List: " + isMail(); 
		
		return str;
	}
}
