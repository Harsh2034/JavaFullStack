package day3;

public class rule3 {
 public static void main(String[] args) {
	 child1 c = new child1();
	 System.out.println(c.b);
	 System.out.println(c.a);
}
}

class parent1 {
	int a=10;

}

class parent2 extends parent1 {0
	int b=110;
	
}
class child1 extends parent2{
	
}


