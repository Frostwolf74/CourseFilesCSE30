package inheritance;

import java.util.Scanner;

public class Carnivora {
	private String name;
	private float weight;
	private int age, length;
	
	static Scanner input = new Scanner(System.in);
	
	public Carnivora(String name, float weight, int age, int length) {
		this.name = name;
		this.weight = weight;
		this.age = age;
		this.length = length;
	}
	
	public Carnivora() {
		System.out.println("");
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

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	//add getters for subclasses to import variables over to the superclass 
	
	public static void main(String[] args) {
		Carnivora human1 = new Carnivora();
		Carnivora fluffy = new Carnivora();
		Carnivora CrocutaCrocuta = new Carnivora(); 
		
		System.out.println("Kingdom: Animalia\nOrder:Carnivora\n"); // shared information

		System.out.printlnln("Name: " + name + "\nWeight: " + weight + "\nAge: " + age + "\nLength: " + length + "\n");
		if(CanisLupus instanceof Carnivora) {
			System.out.println("Family: Canidae\n");
			System.out.println("Region: " + CanisLupus.getRegionA() + "\nSpecies: " + speciesA + "\n");
		}
			
		if(FelisCatus instanceof Carnivora) {
			System.out.println("Family: Felidae\n");
			System.out.println("Species: " + speciesB + "\nColour: " + colourB + "\n");
		}
		if(CrocutaCrocuta instanceof Carnivora) {
			System.out.println("Family: Hyaenidae\n");
			System.out.println("Region: " + regionC + "\nSpecies: " + speciesC + "\n");
		}
	}
}
