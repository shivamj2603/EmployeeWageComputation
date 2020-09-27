package EmployeeWageProblem;

public class EmployeeWageComputation {
	
	public static void main(String[] args) {
		//constants
		final int FULL_TIME = 1;
		final int PART_TIME = 2;
		int WAGE_PER_HOUR = 20;
		//variables
		int empWage =0;
		int empHours =0;  
		int empCheck = (int) Math.floor((Math.random() * 10))%2;
		
		switch(empCheck) {
		
		case FULL_TIME: 
			    empHours = 8;
				break;
				
		case PART_TIME: 
			    empHours = 4;
				break;
				
		default: 
			     empHours = 0;
				 break;
	    }
		
		empWage = WAGE_PER_HOUR * empHours;
		System.out.println("Employee wage is : "+ empWage);
		    
	}

}
