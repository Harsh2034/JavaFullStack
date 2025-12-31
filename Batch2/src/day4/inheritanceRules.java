package day4;

class parent{
	animal disp() {
		animal a = new animal();
		return a;
	}
}

class chil extends parent{
	dog disp1() {
		dog d  = new dog();
		return d;
	}
}
class animal{
	
}

class dog{
	
}

public class inheritanceRules {

	public static void main(String[] args) {
		parent p = new parent();
		System.out.println(p.disp());
		
	}

}
