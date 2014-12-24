package com.deitel.jhtp.ch09;

public class BasePlusCommissionEmployee3 extends CommissionEmployee3 {
	
	private double baseSalary;

	public BasePlusCommissionEmployee3(String first, String last, String ssn, double sales, double rate, double salary) {
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
	public double earnings() {
		return getBaseSalary() + super.earnings();
	}
	
	@Override
	public String toString() {
		return String.format("%s %s\n%s: %.2f",
				"base-salaried", super.toString(),
				"base salary", getBaseSalary());				
	}

}
