package main;

public class Pet {

	private String petNAme;

	public Pet(String petNAme) {
		super();
		this.petNAme = petNAme;
	}

	public String getPetNAme() {
		return petNAme;
	}

	public void setPetNAme(String petNAme) {
		this.petNAme = petNAme;
	}

	@Override
	public String toString() {
		return "Pet [petNAme=" + petNAme + "]";
	}
	
}
