package org.abstracts.animals;

public class Main {

	public static void main(String[] args) {
		Dog dg1 = new Dog("Cane", "Verso cane", "Cibo cane");
		System.out.println(dg1);
		
		Canarin ca1 = new Canarin("Canarino", "Verso Canarino", "cibo Canarino");
		System.out.println(ca1);
		
		Dolphin dh1 = new Dolphin("Delfino", "Verso delfino", "cibo delfino");
		System.out.println(dh1);
		
		Eagle eg1 = new Eagle("Aquila", "Verso aquila", "cibo aquila");
		System.out.println(eg1);
	}
	
}
