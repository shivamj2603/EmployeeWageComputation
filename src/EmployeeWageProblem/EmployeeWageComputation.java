package EmployeeWageProblem;

public class EmployeeWageComputation {
	//constants
	static final int FULL_TIME = 1;
	static final int PART_TIME = 2;
	static final int WAGE_PER_HOUR = 20;
	static final int NO_OF_WORKING_DAYS = 20;
	static final int MAX_HOURS_IN_MONTH = 100;
	public static int calculateWage() {
		int totalEmpWage = 0;
		int totalEmpHours = 0;
		int totalWorkingDays = 0;
		while(totalEmpHours < MAX_HOURS_IN_MONTH
				&& totalWorkingDays < NO_OF_WORKING_DAYS) {
			int empHours = 0;
			int empWage = 0;
			int empCheck = (int) Math.floor((Math.random() * 10)) % 2;
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
			empWage = WAGE_PER_HOUR * empHours;
			totalEmpWage += empWage;
			totalEmpHours += empHours;
			System.out.println("Daily Employee Wage is :" + empWage);
		}
		return totalEmpWage;
	}
	public static void main(String[] args) {
		int totalEmpWage;
		totalEmpWage = calculateWage();
		System.out.println("Total employee wage : " + totalEmpWage);
	}

}