package day4;

public class code {
	public static void main(String[] args) {
		Child c=new Child();
		c.disp();
	}
}

class Parent{
	void disp() {
		System.out.println("This is parent method");
	}
}

class Child extends Parent{
	protected void disp() {
		System.out.println("This is child method");
	}
}
class child extends Parent{
	int disp() {
		System.out.println("");
		return ;
	}
}