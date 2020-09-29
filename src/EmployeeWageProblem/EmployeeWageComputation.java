package EmployeeWageProblem;
import java.util.ArrayList;

public class EmployeeWageComputation implements CompanyEmployeeWage {
	//constants
	static final int FULL_TIME = 1;
	static final int PART_TIME = 2;
	//variables
	private ArrayList<CompanyEmpWage> companyEmpWageList;
	
	public EmployeeWageComputation() {
		companyEmpWageList = new ArrayList<CompanyEmpWage>();
	}
	private void addCompanyEmpWage(String company,int empRate,int noOfWorkingDays,int hoursPerMonth) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRate, noOfWorkingDays, hoursPerMonth);
		companyEmpWageList.add(companyEmpWage);
	}
	private void computeEmpWage() {
		for(int i = 0; i < companyEmpWageList.size(); i++) {
			CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage)); 
			System.out.println(companyEmpWage);
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
		