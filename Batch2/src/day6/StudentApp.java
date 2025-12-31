package day6;

public class StudentApp {

	public static void main(String[] args) {
		Student s  = new Student();
		Bike b =new Bike("f1",10000000,"Green");
//		System.out.println(b.getBrand());
		s.hasA(b);
		Book b1 = new Book("yeyeyeye",150);
		System.out.println(b1.getPrice());
		s.hasA(b1);
		System.out.println("------------");
		System.out.println(s.h.getJob());
		System.out.println(s.b2.getCells());

	}

}
class Student extends Human{
	Heart h =  new Heart("pumping",50);
	void hasA(Bike b) {
		System.out.println(b.getBrand());
	}
	
	Brain b2 = new Brain(50,10000000);
	void hasA(Book b2) {
		System.out.println(b2.getPrice());
	}
}
class Human{
		
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

class Brain{
	int weight;
	int cells;
	public Brain(int weight, int cells) {
		super();
		this.weight = weight;
		this.cells = cells;
	}
	public int getWeight() {
		return weight;
	}
	public int getCells() {
		return cells;
	}
}

class Book{
	String Text;
	int Price;
	public Book(String text, int price) {
		super();
		Text = text;
		Price = price;
	}
	public String getText() {
		return Text;
	}
	public int getPrice() {
		return Price;
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