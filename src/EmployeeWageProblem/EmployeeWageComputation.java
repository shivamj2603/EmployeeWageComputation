package EmployeeWageProblem;

public class EmployeeWageComputation {
	//constants
	static final int FULL_TIME = 1;
	static final int PART_TIME = 2;
	private String company;
	private int empRate;
	private int noOfWorkingDays;
	private int noOfHoursPerMonth;
	private int totalEmpWage;
	public EmployeeWageComputation(String company,int empRate,int noOfWorkingDays,int noOfHoursPerMonth) {
		this.company = company;
		this.empRate = empRate;
		this.noOfWorkingDays = noOfWorkingDays;
		this.noOfHoursPerMonth= noOfHoursPerMonth;
	}
	int calculateWage() {
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
		return totalEmpWage;
	}
	public String toString() {
		return "Total Employee Wage of " + company + " is " + totalEmpWage;	
	}
	public static void main(String[] args) {
		EmployeeWageComputation WalMart = new EmployeeWageComputation("D-Mart",20,30,100);
		WalMart.calculateWage();
		System.out.println(WalMart);
		EmployeeWageComputation Reliance = new EmployeeWageComputation("Reliance",25,25,120);
		Reliance.calculateWage();
		System.out.println(Reliance);
	}

}