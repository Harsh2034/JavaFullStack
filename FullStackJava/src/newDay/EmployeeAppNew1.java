package newDay;


class EmployeeAppNew1 {
	int emp_id;
	String name;
	int Salary;
	
	public EmployeeAppNew1() {
		this(101,"Arsh",20);
		System.out.println("0 param constructor is called..");
	}
	public EmployeeAppNew1(int emp_id) {
//		this(101,"Arsh",20);
		System.out.println("1 param constructor is called..");
	}
	public EmployeeAppNew1(int emp_id, String name) {
		this(101);
		System.out.println("2 param constructor is called..");
	}
	public EmployeeAppNew1(int emp_id, String name, int Salary) {
		this(101,"Arsh");
		System.out.println("3 param constructor is called..");
	}
}

public class EmployeeAppNew1{
	public static void main(String[] args) {
		Employee e = new Employee();
	}
}