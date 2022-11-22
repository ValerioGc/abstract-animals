package org.abstracts.animals;

public class Canarin extends Animals implements IVolante{
	
	public Canarin(String name, String sound, String food) {
		super( name,  sound,  food);
	}

	@Override
	String verso() {
		return "Verso Canarino ";
	}

	@Override
	String mangia() {return "Cibo Canarino";}
	
	@Override
	public void vola() {
		System.out.println("sto volando");
	}
}
