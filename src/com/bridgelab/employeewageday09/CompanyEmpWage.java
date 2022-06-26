package com.bridgelab.employeewageday09;

public class CompanyEmpWage {

	private String company;
	private int maxWorkingDay, maxWorkingHour, wagePerHour,
			totalWorkingHour;

	private double totalSalary;

	public CompanyEmpWage(String company, int maxWorkingDay,
			int maxWorkingHour, int wagePerHour) {
		this.company = company;
		this.maxWorkingDay = maxWorkingDay;
		this.maxWorkingHour = maxWorkingHour;
		this.wagePerHour = wagePerHour;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getMaxWorkingDay() {
		return maxWorkingDay;
	}

	public void setMaxWorkingDay(int maxWorkingDay) {
		this.maxWorkingDay = maxWorkingDay;
	}

	public int getMaxWorkingHour() {
		return maxWorkingHour;
	}

	public void setMaxWorkingHour(int maxWorkingHour) {
		this.maxWorkingHour = maxWorkingHour;
	}

	public int getWagePerHour() {
		return wagePerHour;
	}

	public void setWagePerHour(int wagePerHour) {
		this.wagePerHour = wagePerHour;
	}

	public int getTotalWorkingHour() {
		return totalWorkingHour;
	}

	public void setTotalWorkingHour(int totalWorkingHour) {
		this.totalWorkingHour = totalWorkingHour;
	}

	public double getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}

	@Override
	public String toString() {
		return "Employee Company name : " + company
				+ "\nEmployee monthly wage : $"
				+ totalSalary + " USD"
				+ "\nEmployee Total working hour : "
				+ totalWorkingHour + " Hours\n"
				+ "------------------------------------";
	}
}
