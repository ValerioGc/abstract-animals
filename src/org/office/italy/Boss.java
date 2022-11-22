package org.office.italy;

public class Boss extends Person {
	
	private int salary;
	private int bonus;
	
	public Boss(String name, String surname, String dateOfBirth, int salary, int bonus) {
		super(name, surname, dateOfBirth);
		setSalary(salary);
		setBonus(bonus);
	}

	@Override
	public int getYearIncome() {
		int annualSalary = (salary * 12) +  bonus;		
		return annualSalary;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Boss:" + super.toString();
	}
}
