package day5;

class Student{
	Heart h = new Heart("pumping",55);
	void hasA(Bike b) {
		System.out.println(b.getBrand());
		System.out.println(b.getPrice());
		System.out.println(b.getColour());
	}
}

class Bike{
	String brand;
	double price;
	String colour;
	public Bike (String brand, double price, String colour) {
		this.brand = brand;
		this.price = price;
		this.colour = colour;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
}

class Heart{
	String Job;
	double weight;
	
	public Heart(String Job, double weight) {
		this.Job = Job;
		this.weight = weight;
	}
	
	public String getJob() {
		return Job;
	}
	public void setJob(String job) {
		Job = job;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}

public class StudentApp {

	public static void main(String[] args) {
		Student s = new Student();
//		Student s = null;
		
		Bike b = new Bike("f1",100000,"Red");
			System.out.println(s.h.getJob());
			System.out.println(s.h.getWeight());
			System.out.println(b.getBrand());
			System.out.println(b.getColour());
			System.out.println(b.getPrice());
	}

}
