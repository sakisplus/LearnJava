package com.deitel.jhtp.ch09;

public class BasePlusCommissionEmployee2 extends CommissionEmployee2 {
	
	private double baseSalary;

	public BasePlusCommissionEmployee2(String first, String last, String ssn, double sales, double rate, double salary) {
		super(first, last, ssn, sales, rate);
		setBaseSalary(salary);
	}
	
	public void setBaseSalary(double salary) {
		baseSalary = (salary < 0.0) ? 0.0 : salary;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	
	@Override
	public double getEarnings() {
		return baseSalary + (commissionRate * grossSales);
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
				"commission employee", firstName, lastName,
				"social security number", socialSecurityNumber,
				"gross sales", grossSales,
				"commissionRate", commissionRate,
				"base salary", baseSalary);				
	}

}
