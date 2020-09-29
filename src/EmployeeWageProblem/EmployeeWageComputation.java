package EmployeeWageProblem;

public class EmployeeWageComputation {
	//constants
	static final int FULL_TIME = 1;
	static final int PART_TIME = 2;
	//variables
	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;
	
	public EmployeeWageComputation() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}
	private void addCompanyEmpWage(String company,int empRate,int noOfWorkingDays,int hoursPerMonth) {
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRate, noOfWorkingDays, hoursPerMonth);
		numOfCompany++;
	}
	private void computeEmpWage() {
		for(int i = 0; i < numOfCompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i])); 
			System.out.println(companyEmpWageArray[i]);
		}
	}
	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		int totalEmpHours = 0;
		int totalWorkingDays = 0;
		while(totalEmpHours < companyEmpWage.noOfHoursPerMonth
				&& totalWorkingDays < companyEmpWage.noOfWorkingDays) {
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
			totalEmpHours += empHours;
		}
	    System.out.println("Days : "+totalWorkingDays+" Emp Hours : "+ totalEmpHours);
		return totalEmpHours * companyEmpWage.empRate;
	}
	public static void main(String[] args) {
		EmployeeWageComputation empWageBuilder = new EmployeeWageComputation();
		empWageBuilder.addCompanyEmpWage("WalMart",20,30,100);
		empWageBuilder.addCompanyEmpWage("Reliance",25,20,120);
		empWageBuilder.computeEmpWage();
		}
}
		