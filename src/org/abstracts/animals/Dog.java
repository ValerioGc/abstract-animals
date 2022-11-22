package org.abstracts.animals;

public class Dog extends Animals {

	
	public Dog(String name, String sound, String food) {
		super( name,  sound,  food);
	}

	@Override
	String verso() {
		return "Verso cane ";
	}

	@Override
	String mangia() {return "cibo cane";}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
