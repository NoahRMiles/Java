
public class num5payroll {
	//variables
		private String name; // name
		private int Id;// id number
		private double payRate; // pay rate
		private double hours; // hours
		
		public num5payroll(String name, int Id, double payRate, double hours) {
			this.name = name; // sets name
			this.Id = Id;// sets id
			this.payRate = payRate; //sets pay rate
			this.hours = hours; // sets hours
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @return the id
		 */
		public int getId() {
			return Id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			Id = id;
		}
		/**
		 * @return the payRate
		 */
		public double getPayRate() {
			return payRate;
		}
		/**
		 * @param payRate the payRate to set
		 */
		public void setPayRate(double payRate) {
			this.payRate = payRate;
		}
		/**
		 * @return the hours
		 */
		public double getHours() {
			return hours;
		}
		/**
		 * @param hours the hours to set
		 */
		public void setHours(double hours) {
			this.hours = hours;
		}
	
	}
