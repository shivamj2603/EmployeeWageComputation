package EmployeeWageProblem;

public class EmployeeWageComputation {
	
	public static void main(String[] args) {
		//constants
		int FULL_TIME = 1;
		int WAGE_PER_HOUR = 20;
		//variables
		int empWage =0;
		int empHours =0;  
		int empCheck = (int) Math.floor((Math.random() * 10))%2;
		if(empCheck == FULL_TIME) {
			empHours = 8;
		}
		
		empWage = WAGE_PER_HOUR * empHours;
		System.out.println("Employee wage is : "+ empWage);
		    
	}

}
