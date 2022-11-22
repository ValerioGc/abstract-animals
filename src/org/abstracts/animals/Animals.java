package org.abstracts.animals;

public abstract class Animals {
	
	private String name;
	private String sound;
	private String food;
	private String sleep;
		
	public Animals(String name, String sound, String food) {
		setName(name);
		setSound(sound);
		setFood(food);
		setSleep("Zzz");
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}


	public String getFood() {
		return food;
	}


	public void setFood(String food) {
		this.food = food;
	}


	public String getSleep() {
		return sleep;
	}


	public void setSleep(String sleep) {
		this.sleep = sleep;
	}

	// Methods
	public String dormi() {
		return sleep;
	}
	abstract String verso();
	abstract String mangia();
	
	@Override
	public String toString() {
		return "Nome Animale: " + getName() 
				+ "\nVerso: " + verso() 
				+ "\n" + "Cibo: " + mangia()
				+ "\nDormi: " + getSleep()
				+ "\n----------------------";
	}
}
