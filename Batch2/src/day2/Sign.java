package day2;

public class Sign {
	 public static void main(String [] args) {
		System.out.println("Hello");
		Sign.main(7);
		int ar[]= {10,20,30,40};
		Sign.main(ar);
	}
	 public static void main(int a) {
		 System.out.println("accepting any arg"+a);
	 }
	 public static void main(int [] b) {
		System.out.println("another arg " +b[2]);
	}
	
}
                                                       