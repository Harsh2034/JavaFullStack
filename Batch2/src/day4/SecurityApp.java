package day4;

class SecurityForce{
	void job() {
		System.out.println("Protects Nation");
	}
	void Protect() {
		System.out.println("Protect County");
	}
	void weapon() {
		System.out.println("using Weapons");
	}
}

class Army extends SecurityForce{
	void Protect() {
		System.out.println("protects LandWays ");
	}
	void weapon() {
		System.out.println("Using Tanks");
	}
}

class Navy extends SecurityForce{
	void Protect() {
		System.out.println("protects SeaWays");
	}
	void weapon() {
		System.out.println("Using Ships");
	}
}

class AirForce extends SecurityForce{
	void Protect() {
		System.out.println("protect AirWays");
	}
	void weapon() {
		System.out.println("Using Jets");
	}
}

public class SecurityApp {
	static void Duty(SecurityForce s ) {  //parent class reference
		s.job();
		s.Protect();
		s.weapon();
	}
	public static void main(String[] args) {
		SecurityForce s;
		Duty(new Army());
		System.out.println("----------------------");
		Duty(new Navy());
		System.out.println("----------------------");
		Duty(new AirForce());
			
		
	}
}
