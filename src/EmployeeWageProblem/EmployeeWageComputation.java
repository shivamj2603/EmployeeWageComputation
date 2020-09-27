package EmployeeWageProblem;

public class EmployeeWageComputation {
	
	public static void main(String[] args) {
		//constants
		final int FULL_TIME = 1;
		final int PART_TIME = 2;
		final int WAGE_PER_HOUR = 20;
		final int NO_OF_WORKING_DAYS=20;
		//variables
		int empWage =0;
		int empHours =0; 
		int totalEmpWage=0;
		
		for(int day=0 ; day<=NO_OF_WORKING_DAYS ; day++) {
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
		   totalEmpWage += empWage;
		}
		System.out.println("Total Employee wage is : "+ totalEmpWage);
		    
	}

}
