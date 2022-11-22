package org.office.italy;

public class Main {

	public static void main(String[] args) {
		Employee ey1 = new Employee("Valerio", "Genco", "1997-12-17", 2000, 12);
		Employee ey2 = new Employee("Alessio", "esposito", "1991-03-11", 4000, 12);
		Employee ey3 = new Employee("Jacopo", "Bianchi", "1999-10-15", 1200, 12);
		
		Employee bs1 = new Employee("Luca", "Verdi", "1989-02-01", 3000, 600);
		Employee bs2 = new Employee("Mario", "Rossi", "1987-08-07", 5000, 500);
	
	
		Person[] agencyMembers = {ey1, ey2, ey3, bs1, bs2};
		
		int maxYIncome = Integer.MIN_VALUE;
		int minYIncome = Integer.MAX_VALUE;
		Person mostPayed = null;
		Person lessPayed = null;
		int totalAgencyCost = 0;
		for (int i = 0; i < agencyMembers.length; i++) {
			Person currentEmployee = agencyMembers[i];
			int actualIncome = currentEmployee.getYearIncome();
			if (actualIncome > maxYIncome) {
				maxYIncome = actualIncome;
				mostPayed = currentEmployee;
			}
			if (actualIncome < minYIncome) {
				minYIncome = actualIncome;
				lessPayed = currentEmployee;
			}
			totalAgencyCost += actualIncome;
		}
		int averageEmpCost = totalAgencyCost / agencyMembers.length;
		System.out.println("\nPersona più pagata: " + mostPayed);
		System.out.println("\nPersona pagata meno: " + lessPayed);
		System.out.println("------------------------------------");
		System.out.println("Costo totale azienda: " + totalAgencyCost + " euro");
		System.out.println("Media stipendi azienda: " + averageEmpCost + " euro");
		System.out.println("------------------------------------");
	}
}
