package com.bridgelab.employeewageday09;

import java.util.ArrayList;
import java.util.List;

public class EmployeeWageCalUC8 implements ICompanyWage {

	final int PRESENT = 1;
	final int PART_TIME = 2;
	final int WORKING_HOUR = 8;

	List<CompanyEmpWage> companies;

	public EmployeeWageCalUC8() {
		this.companies = new ArrayList<CompanyEmpWage>();
	}

	@Override
	public void addCompany(String companyName, int maxWorkingDay, int maxWorkingHour, int wagePerHour) {
		CompanyEmpWage company = new CompanyEmpWage(companyName, maxWorkingDay, maxWorkingHour, wagePerHour);
		companies.add(company);
	}

	@Override
	public void computeEmpWage() {
		for (int i = 0; i < companies.size(); i++) {
			computeEmpWage(companies.get(i));
//			System.out.println(companies.get(i));
		}
		System.out.println("Total companies : " + totalCompanies());
	}

	@Override
	public int totalCompanies() {
		return companies.size();
	}

	@Override
	public CompanyEmpWage getTotalEmpWage(String companyName) {
		for (CompanyEmpWage companyEmpWage : companies) {
			if (companyEmpWage.getCompany().toLowerCase().equals(companyName.toLowerCase())) {
				return companyEmpWage;
			}
		}
		return null;
	}

	private void computeEmpWage(CompanyEmpWage company) {
		int totalWorkingHour = 0;
		int day = 0;

		while (day < company.getMaxWorkingDay() && totalWorkingHour < company.getMaxWorkingHour()) {
			int isPresent;
			int remainingWorkingHour = company.getMaxWorkingHour() - totalWorkingHour;
			if (remainingWorkingHour < WORKING_HOUR && !(remainingWorkingHour < (WORKING_HOUR / 2))) {
				isPresent = PART_TIME;
			} else if (remainingWorkingHour < (WORKING_HOUR / 2)) {
				break;
			} else {
				isPresent = (int) (Math.random() * 3);
			}

			totalWorkingHour = totalWorkingHour + getWorkingHour(isPresent);
			day++;
		}
		company.setTotalWorkingHour(totalWorkingHour);
		company.setTotalSalary(totalWorkingHour * company.getWagePerHour());

	}

	private int getWorkingHour(int empPresent) {
		switch (empPresent) {
		case PRESENT:
			return WORKING_HOUR;

		case PART_TIME:
			return WORKING_HOUR / 2;

		}
		return 0;
	}

	public static void main(String[] args) {
		EmployeeWageCalUC8 empWageBuilder = new EmployeeWageCalUC8();
		empWageBuilder.addCompany("DMart", 20, 60, 25);
		empWageBuilder.addCompany("Reliance", 22, 60, 35);
		empWageBuilder.addCompany("Dell", 20, 48, 22);
		empWageBuilder.addCompany("Bridgelabz", 25, 80, 40);

		empWageBuilder.computeEmpWage();

		System.out.println(empWageBuilder.getTotalEmpWage("DMart"));
	}
}