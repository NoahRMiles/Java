
public class num10Ship {

	private String name;
	private String buildYear;
	
	public num10Ship(String name, String buildYear) {
		setName(name);
		setBuildYear(buildYear);
	}
	
	public String toString(){
		String str = "";
		
		str = "Name: " + getName()+
			  "\nBuild Year: " + getBuildYear();
		
		return str;
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
	 * @return the buildYear
	 */
	public String getBuildYear() {
		return buildYear;
	}

	/**
	 * @param buildYear the buildYear to set
	 */
	public void setBuildYear(String buildYear) {
		this.buildYear = buildYear;
	}
	
}
