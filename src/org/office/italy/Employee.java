package org.office.italy;

public class Employee extends Person {
	private int salary;
	private int monthlyCount;
	
	public Employee(String name, String surname, String dateOfBirth, int salary, int monthlyCount) {
		super(name, surname, dateOfBirth);
		setSalary(salary);
		setMonthlyCount(monthlyCount);
	}

	@Override
	public int getYearIncome() {
		int annualSalary = getSalary() * getMonthlyCount();		
		return annualSalary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getMonthlyCount() {
		return monthlyCount;
	}

	public void setMonthlyCount(int monthlyCount) {
		this.monthlyCount = monthlyCount;
	}

	@Override
	public String toString() {
		return "Impiegato:" + super.toString();
	}
}
