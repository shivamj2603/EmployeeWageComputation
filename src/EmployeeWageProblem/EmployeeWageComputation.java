package EmployeeWageProblem;

public class EmployeeWageComputation {
	public static void main(String[] args) {
		    //constants
			int FULL_TIME = 1;
			//variables
			int empCheck = (int) Math.floor((Math.random() * 10))%2;
			
			if(empCheck == FULL_TIME) {
				System.out.println("Employee is Present");
			}
			else {
				System.out.println("Employee is Abscent");
			}
		
	}

}
