package org.office.italy;

public class Main {

	public static void main(String[] args) {
		Employee ey1 = new Employee("Valerio", "Genco", "1997-12-17", 100, 12);
		Employee ey2 = new Employee("Alessio", "esposito", "1997-12-17", 100, 12);
		Employee ey3 = new Employee("Jacopo", "Bianchi", "1997-12-17", 100, 12);
		
		Employee bs1 = new Employee("Luca", "Verdi", "1997-12-17", 100, 3000);
		Employee bs2 = new Employee("Mario", "Rossi", "1997-12-17", 100, 500);
	
	
		Person[] agencyMembers = {ey1, ey2, ey3, bs1, bs2};
		
		int maxYIncome = Integer.MIN_VALUE;
		int minYIncome = Integer.MAX_VALUE;
		Person mostPayed = null;
		Person lessPayed = null;
		maxCost
		for (int i = 0; i < agencyMembers.length; i++) {
			Person currentEmployee = agencyMembers[i];
			
			if (currentEmployee.getYearIncome() < yearIncome) {
				maxYIncome = yearIncome;
				mostPayed = currentEmployee;
			}
		}
	}
}
