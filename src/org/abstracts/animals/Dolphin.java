package org.abstracts.animals;

public class Dolphin extends Animals implements INuotante {

	public Dolphin(String name, String sound, String food) {
		super( name,  sound,  food);
	}

	@Override
	String verso() {
		return "Verso Delfino ";
	}

	@Override
	String mangia() {return "Cibo Delfino";}
	
	@Override
	public void nuota() {
		System.out.println("sto nuotando");
	}
}
