
public class num4LandTrack {
	private double width;
	private double length;
	private double Area;
	/**
	* Default Constructor
	*/
	public num4LandTrack() {
	// TODO Auto-generated constructor stub
	}
	public num4LandTrack(double length, double width) {
		setLength(length);
		setWidth(width);
	}
	/**
	* Returns the Area of the track
	*/
	public double getArea(){
		double Area;
		Area = length * width;
	return Area;
	}
	/*
	* @see java.lang.Object#equals(java.lang.Object)
	*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		num4LandTrack other = (num4LandTrack) obj;
			if (Double.doubleToLongBits(Area) != Double.doubleToLongBits(other.Area)) {
				return false;
		}
		return true;
	}
	public String toString(){
		String str = "The Length is " + getLength() + "\nThe Width is " +
		getWidth() + "\nThe Area is " + getArea() + "\n";
		return str;
	}
	/**
	* @return the width
	*/
	public double getWidth() {
		return width;
	}
	/**
	* @param width the width to set
	*/
	public void setWidth(double width) {
		this.width = width;
	}
	/**
	* @return the length
	*/
	public double getLength() {
		return length;
	}
	/**
	* @param length the length to set
	*/
	public void setLength(double length) {
		this.length = length;
	}

}