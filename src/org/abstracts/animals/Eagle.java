package org.abstracts.animals;

public class Eagle extends Animals implements IVolante {

	public Eagle(String name, String sound, String food) {
		super( name,  sound,  food);
	}

	@Override
	String verso() {
		return "Verso aquila";
	}

	@Override
	String mangia() {return "Cibo Aquila";}
	
	@Override
	public void vola() {
		System.out.println("sto volando");
	}
}
