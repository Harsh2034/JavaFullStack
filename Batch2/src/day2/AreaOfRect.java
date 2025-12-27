package day2;

class Rectangle{
	int height;
	int base;
	static double  a = 0.5;
	
	Rectangle(int height, int base){
		this.base = base;
		this.height = height;
	}
	
	double display() {
		return a*base*height;
	}
}

public class AreaOfRect {

	public static void main(String[] args) {
		int height = 5;
		int base = 8;
		Rectangle r  = new Rectangle(height, base);
		System.out.println(r.display());
		
	}
}
