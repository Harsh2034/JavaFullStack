package day3;

class Sec_forces{
	
	void job() {
		System.out.println(" To Protect Nation");
		
	}
	void protect() {
		System.out.println("Protect Country from Danger");
	}
	
}

class Army extends Sec_forces{
	void protect() {
		System.out.println("Army Protect Country from Land Danger");
	}
}

class Navy extends Sec_forces{
	void protect() {
		System.out.println("Navy Protect Country from Sea Danger");
	}
}

class AirForce extends Sec_forces{
	void protect() {
		System.out.println("Air Forces Protect Country from Air Danger");
	}
}

public class Security_force {

	public static void main(String[] args) {
		Sec_forces o = new Sec_forces();
		Army o1 = new Army();
		Navy o2 = new Navy();
		AirForce o3 = new AirForce();
		o.job();
		o1.protect();
		o1.job();
		System.out.println("--------------------------");
		o2.protect();
		o2.job();
		System.out.println("--------------------------");
		o3.protect();
		o3.job();
		
	}
}
