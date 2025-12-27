package pce.dya8.company.dept;

import pce.day8.company.employee.Employee;

public class Manager extends Employee {
	
	void accessEmployeeData(){
		System.out.println("EmpId: "+ empId);
		System.out.println("Salary"+ salary);
		showEmployeeDetails();
		
	}
	public static void main (String[] args) {
		Manager m1 = new Manager();
		m1.accessEmployeeData();
	}
	
}
