package day3;

 class parent{
	private int a = 10;
	int b = 99;
	
	private void disp() {
		System.out.println(a);
		System.out.println(b);
	}
}
class child extends parent{
	
}

public class secProg {
	public static void main(String[] args) {
		child c= new child();
		System.out.println(c.a);
		System.out.println("------------------");
		c.disp(); // private classes and methods can't be accessed
	}

}
