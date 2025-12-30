package day3;

class parent3{
	int a ;
	int b ;
	public parent3() {
		a=10;
		b=20;
	}
	
	public parent3(int a , int b) {
		this.a = a;
		this.b = b;	
	}
}

class baccha extends parent3{
	public baccha () {
		a=30;
		b=40;
	}
	public baccha (int a, int b ) {
		this.a =a;
		this.b =b;
	}
}
public class prog4 {

	public static void main(String[] args) {
		baccha c = new baccha();
		System.out.println(c.a+" "+ c.b);
	}

}
