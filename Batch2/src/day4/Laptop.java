package day4;

class laptop{
	
}
class charger {
	String Brand ;
	int Power;
	
	
	public charger(String brand, int power) {
		super();
		this.Brand = brand;
		this.Power = power;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public int getPower() {
		return Power;
	}
	public void setPower(int power) {
		Power = power;
	}

}
class Os {
	 String Brand ;
	 double version;
	 
	public Os(String brand, double version) {
		super();
		this.Brand = brand;
		this.version = version;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}
}

public class laptopApp {
  public static void main(String[] args) {
	laptopApp l = new laptopApp();
	
 }
}
