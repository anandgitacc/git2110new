package org.gittest1;

public class EmployeeDetails {
	
	private void empName() {
		System.out.println("Anand");
	}
	
	private void empMobile() {
		System.out.println("8939278836");
	}
	private void empAdd() {
		System.out.println("Chennai-OMR");
	}
	private void empId() {
		System.out.println("Employee id: 123");
	}
//<<<<<<< HEAD
//=======
//>>>>>>> df19fc11d847719b812202dfb0041381dd0a0314
	
	public static void main(String[] args) {
		
		EmployeeDetails e = new EmployeeDetails();
		e.empMobile();
		e.empName();
	}

}
