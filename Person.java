package inheritance;

import java.util.Scanner;

public class Person {
	static Scanner input = new Scanner(System.in);
	
	private String name;
	private int energyL; 
	private float weight;

	public Person(String name, int energyL, float weight) {
		this.name = name;
		this.energyL = energyL;
		this.weight = weight;
	}
	public int getEnergyL() {
		return energyL;
	}

	public void addEnergyL(int energyL) {
		this.energyL += energyL;
	}

	public float getWeight() {
		return weight;
	}

	public void addWeight(float weight) {
		this.weight += (weight / 1000);
	}

	static Person bob = new Person("Bob", 50, 70);
	
	public static void main(String[] args) {	
		Meal mealChoice;
		Meal food1 = new Food("food1", 20, 500, 72); // string, percent, grams, celsius
		Meal food2 = new Food("food2", 5, 100, 22);
	
		System.out.println("1.");
		System.out.println(food1);
		
		System.out.println("\n2.");
		System.out.println(food2);
		
		System.out.println("\nSelect an option: ");
		int choice = input.nextInt();
		
		switch (choice) {
		case 1:
			mealChoice = food1;
			break;
		case 2:
			mealChoice = food2;
			break;
		default:
			mealChoice = null;
			break;
		}
		eatMeal(mealChoice);
	}
	
	public static void eatMeal(Meal meal) {
		System.out.println("Previous values: \nEnergy levels: " + bob.getEnergyL() + "%" + "\nWeight: " + bob.getWeight() + "kg");
		bob.addEnergyL(meal.getFoodEnergy());
		bob.addWeight(meal.getFoodWeight());
		
		System.out.println("\nNew values: \nEnergy levels: " + bob.getEnergyL() + "%" + "\nWeight: " + bob.getWeight() + "kg");
	}
}
