package org.abstracts.animals;

public class Main {

	public static void main(String[] args) {
		Dog dg1 = new Dog("Cane", "Verso cane", "Cibo cane");
		System.out.println(dg1);
		faiNuotare(dg1);
		System.out.println("\n----------------------");
		
		Canarin ca1 = new Canarin("Canarino", "Verso Canarino", "cibo Canarino");
		System.out.println(ca1);
		faiVolare(ca1);
		System.out.println("\n----------------------");
		
		Dolphin dh1 = new Dolphin("Delfino", "Verso delfino", "cibo delfino");
		System.out.println(dh1);
		faiNuotare(dh1);
		System.out.println("\n----------------------");
		
		Eagle eg1 = new Eagle("Aquila", "Verso aquila", "cibo aquila");
		System.out.println(eg1);
		faiVolare(eg1);
		System.out.println("\n----------------------");
		
	}
	
	public static void faiNuotare(INuotante animals) {
		animals.nuota();
	}
	public static void faiVolare(IVolante animals) {
		animals.vola();
	}
}
