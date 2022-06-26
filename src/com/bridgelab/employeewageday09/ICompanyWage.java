package com.bridgelab.employeewageday09;

public interface ICompanyWage {
	
	public void addCompany(String companyName,
			int maxWorkingDay, int maxWorkingHour,
			int wagePerHour);

	public void computeEmpWage();
	
	public int totalCompanies();
	
	public CompanyEmpWage getTotalEmpWage(String companyName);

}
