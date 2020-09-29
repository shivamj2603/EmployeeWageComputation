package EmployeeWageProblem;
import java.util.*;

public class EmployeeWageComputation implements CompanyEmployeeWage {
	//constants
	static final int FULL_TIME = 1;
	static final int PART_TIME = 2;
	//variables
	private ArrayList<CompanyEmpWage> companyEmpWageList;
	public HashMap<Integer,Integer> dailyWageMap;

	public EmployeeWageComputation() {
		companyEmpWageList = new ArrayList<CompanyEmpWage>();
	}
	public void addCompanyEmpWage(String company,int empRate,int noOfWorkingDays,int hoursPerMonth) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRate, noOfWorkingDays, hoursPerMonth);
		dailyWageMap = new HashMap<Integer,Integer>();
		companyEmpWageList.add(companyEmpWage);	
	}
	public void computeEmpWage() {
		for(int i = 0; i < companyEmpWageList.size(); i++) {
			CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(computeEmpWage(companyEmpWage)); 
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
			ArrayList<Integer> dailyWage = new ArrayList<Integer>();
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
			empWage = empHours * companyEmpWage.empRate;
			dailyWageMap.put(totalWorkingDays,empWage);
		}

		for(HashMap.Entry m:dailyWageMap.entrySet())
		{
			System.out.println("Day " + m.getKey()+" wage: " + m.getValue());
		}

		System.out.println("Days : " + totalWorkingDays+" Emp Hours : " + totalEmpHours);
		int totalEmpWage = totalEmpHours * companyEmpWage.empRate;
		return totalEmpWage;
	}
	public int getTotalEmpWage(String company) {
		int totalWage = 0;
		for(int i = 0; i < companyEmpWageList.size(); i++ ) {
			if(companyEmpWageList.get(i).company.equalsIgnoreCase(company)) {
				totalWage = companyEmpWageList.get(i).totalEmpWage;
				break;
			}
		}
		return totalWage;
	}
	public static void main(String[] args) {
		EmployeeWageComputation empWageBuilder = new EmployeeWageComputation();
		empWageBuilder.addCompanyEmpWage("WalMart",20,30,100);
		empWageBuilder.addCompanyEmpWage("Reliance",25,20,120);
		empWageBuilder.computeEmpWage();
		System.out.println("Total Wage for Walmart: " + empWageBuilder.getTotalEmpWage("Walmart"));
		System.out.println("Total Wage for Reliance: " + empWageBuilder.getTotalEmpWage("Reliance"));
	}
}