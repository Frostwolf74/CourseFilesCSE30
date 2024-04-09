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
	
	public Carnivora() {
		System.out.println("Enter name: ");
		name = input.nextLine();
		input.nextLine();
		System.out.println("Enter weight (kg, int): ");
		weight = input.nextInt();
		input.nextLine();
		System.out.println("Enter age: ");
		age = input.nextInt();
		input.nextLine();
		System.out.println("Enter species: ");
		species = input.nextLine();
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
		Carnivora CanisLupus = new Canidae();
		Carnivora FelisCatus = new Felidae();
		
		introducer(CanisLupus, FelisCatus);
	}
	
	public static void introducer(Carnivora CanisLupus, Carnivora FelisCatus) {
		System.out.println("Kingdom: Animalia\nOrder:Carnivora\n"); // shared information
		
		introducerExtension(CanisLupus);
		introducerExtension(FelisCatus);
		
		// name, weight, age, length, eyeColour, furLength, earType, tailLength, jumpHeight, biteStrength, region, colour
		
		if(CanisLupus instanceof Carnivora) {
			System.out.println("Family: Canidae\n");	
			System.out.println("Eye Colour: " + Canidae.getEyeColour());
		}
			
		if(FelisCatus instanceof Carnivora) {
			System.out.println("Family: Felidae\n");
		}
	}

	private static void introducerExtension(Carnivora Animalia) {
		System.out.println("Name: " + Animalia.name + "\nWeight: " + Animalia.weight + "\nAge: " + Animalia.age + "\nSpecies: " + Animalia.species + "\n");
	}
}
