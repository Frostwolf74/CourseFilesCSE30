package inheritance;

import java.util.Scanner;

public class Carnivora {
	private String name, species;
	private float weight;
	private int age;
	
	static Scanner input = new Scanner(System.in);
	
	public Carnivora(String name, float weight, int age, String species) {
		this.name = name;
		this.weight = weight;
		this.age = age;
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	public static void main(String[] args) {
		Canini CanisLupus = new Canini("Pointed", "Long", "Brown", 85, "Grey Wolf", 48, 10, "Lupus");
		Felinae FelisCatus = new Felinae("Canada", "Grey", 200, 75, "Domestic Cat", 6, 4, "Catus"); 
		Felidae LynxCanadensis = new Felidae(2, 144, "Canada Lynx", 10, 12, "Canadensis");			//int jumpHeight, int biteStrength, String name, float weight, int age, String species
		
		
		Introducer.introducer(CanisLupus);
		Introducer.introducer(FelisCatus);
		Introducer.introducer(LynxCanadensis);
	}
}
