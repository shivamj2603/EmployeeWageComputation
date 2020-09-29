package EmployeeWageProblem;

public class EmployeeWageComputation {
	//constants
	static final int FULL_TIME = 1;
	static final int PART_TIME = 2;
	public static void calculateWage(String company,int empRate,int noOfWorkingDays,int noOfHoursPerMonth) {
		int totalEmpWage = 0;
		int totalEmpHours = 0;
		int totalWorkingDays = 0;
		while(totalEmpHours < noOfHoursPerMonth
				&& totalWorkingDays < noOfWorkingDays) {
			int empHours = 0;
			int empWage = 0;
			int empCheck = (int) Math.floor((Math.random() * 10)) % 3;
			switch(empCheck) {
			case FULL_TIME: 
				empHours = 8;
				totalWorkingDays++;
				break;
			case PART_TIME: 
				empHours = 4;
				totalWorkingDays++;
				break;
			default: 
				empHours = 0;
				break;
			}
			empWage = empRate * empHours;
			totalEmpWage += empWage;
			totalEmpHours += empHours;
		}
		System.out.println("Total Employee Wage of " + company + " is " + totalEmpWage);	
	}
	public static void main(String[] args) {
		calculateWage("WalMart",25,45,120);
		calculateWage("Reliance",30,16,90);
	}

}