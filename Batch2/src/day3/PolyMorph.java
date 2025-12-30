package day3;

class Trainer{
	void teach() {
		System.out.println("Trainer Teaches");
	}
}

class JavaTrainer extends Trainer{
    void teach() {
    	System.out.println("Trainer Teaches Java");
	}
}

class AptiTrainer extends Trainer{
	void teach() {
		System.out.println("Trainer Teaches Aptitude");
	}
}

class TestingTrainer extends Trainer{
	void teach() {
		System.out.println("Trainer Teaches Testing");
	}
	
}

public class PolyMorph {
	static void teach(Trainer T) {
		T.teach();
	}
	public static void main(String[] args) {
//		Trainer T1 = new Trainer();
//		JavaTrainer T2 = new JavaTrainer();
//		AptiTrainer T3 = new AptiTrainer();
//		TestingTrainer T4 = new TestingTrainer();
//		T2.teach();jn
//		T3.teach();
//		T4.teach();
		
		teach(new JavaTrainer());
		teach(new AptiTrainer());
		teach(new TestingTrainer());

		
	}

}
