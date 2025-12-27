package pce;

public class Method {
	static void change(int X[],int index , int value) {
		X [index] = value;
	}
	static void change2(int x,int value) {
		x=value;
	}
	public static void main(String[] args) {
		int A[] = {2,6,8,4,3,66};
		change( A,2,75);
		for (int x:A) {
			System.out.println(x);
		}
		int x=10;
		change2(x,20);
		System.out.println(x);
	}
}
