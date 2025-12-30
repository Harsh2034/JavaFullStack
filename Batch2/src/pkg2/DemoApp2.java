package pkg2;

import pkg1.DemoApp;

public class DemoApp2 {
void disp3() {
	DemoApp d = new DemoApp();
	System.out.println(d.a);
//	System.out.println(d.b);
//	System.out.println(d.c);
//	System.out.println(d.d);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Demo4 extends DemoApp{
	void disp4() {
		System.out.println(a);
		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
	}
}
