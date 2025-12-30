package day3;

 class parent{
	int a = 10;
	int b = 99;
	
	void disp() {
		System.out.println(a);
		System.out.println(b);
	}
}
class child extends parent{
	
}

public class firstOne {
	public static void main(String[] args) {
		child c= new child();
		System.out.println(c.a);
		System.out.println("------------------");
		c.disp();
	}

}
