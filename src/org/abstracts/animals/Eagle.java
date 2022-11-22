package org.abstracts.animals;

public class Eagle extends Animals {

	public Eagle(String name, String sound, String food) {
		super( name,  sound,  food);
	}

	@Override
	String verso() {
		return "Verso Canarino ";
	}

	@Override
	String mangia() {return "Cibo Canarino";}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
