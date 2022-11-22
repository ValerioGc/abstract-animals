package org.office.italy;

import java.time.LocalDate;
import java.util.Random;

public abstract class Person {

	private String name;
	private String surname;
	private LocalDate dateOfBirth;
	private int agencyCode;
	
	
	public Person(String name, String surname, String dateOfBirth) {
		setAgencyCode();
		setName(name);
		setSurname(surname);
		LocalDate date = LocalDate.parse(dateOfBirth);
		setDateOfBirth(date);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public int getAgencyCode() {
		return agencyCode;
	}

	public void setAgencyCode() {
		Random rnd = new Random();
		int rndCode = rnd.nextInt(90000) + 10000;
		this.agencyCode = rndCode;
	}

	
	public String getFullName() {
		return "\nNome: " + getName()
			   + "\nCognome: " + getSurname() 
			   + "\nCodice aziendale: "  + getAgencyCode(); 
	}
	public abstract int getYearIncome();
	
	
	
	@Override
	public String toString() {
		return getFullName() 
				+ "\nData di nascita: " + getDateOfBirth()  
				+ "\nStipendio annuale: " + getYearIncome() + " euro";
	}

}
