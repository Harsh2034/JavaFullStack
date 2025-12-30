package day4;


public class PolyMorph {

	public static void main(String[] args) {
		Tendulkar t  = new ArjunTendulkar();
		t.Job();
		t.profession();
		((ArjunTendulkar)t).smoke();
		
	}

}

class Tendulkar{
	void Job() {
		System.out.println("play Cricket");
	}
	void profession() {
		System.out.println("he is batman");
	}
	
}

class ArjunTendulkar extends Tendulkar{
	void professonal() {
		System.out.println("He is baller");
	}
	void smoke() {
		System.out.println("He smokw some time ");
	}
}