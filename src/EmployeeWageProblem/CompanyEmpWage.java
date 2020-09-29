package EmployeeWageProblem;
import java.util.ArrayList;

public class CompanyEmpWage {
	private String company;
	public int empRate;
	public int noOfWorkingDays;
	public int noOfHoursPerMonth;
	private int totalEmpWage;
	public CompanyEmpWage(String company,int empRate,int noOfWorkingDays,int noOfHoursPerMonth) {
		this.company = company;
		this.empRate = empRate;
		this.noOfWorkingDays = noOfWorkingDays;
		this.noOfHoursPerMonth= noOfHoursPerMonth;
	}
	public int getTotalEmpWage() {
		return totalEmpWage;
	}
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	public String toString() {
		return "The above records are daily wages for comapny" + company + "\nTotal Employee Wage of " + company + " is " + totalEmpWage;	
	}

}
