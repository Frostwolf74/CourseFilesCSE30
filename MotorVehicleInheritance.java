package inheritance;

import java.util.Scanner;

public class MotorVehicleInheritance {
	private String make, model, colour;
	private int milage, year;
	
	static Scanner input = new Scanner(System.in);
	
	public MotorVehicleInheritance(String make, String model, String colour, int milage, int year) {
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.milage = milage;
		this.year = year;
	}
	
	public MotorVehicleInheritance() {
		System.out.println("Input make: ");
		setMake(input.nextLine());
		System.out.println("Input model: ");
		setModel(input.nextLine());
		System.out.println("Input colour: ");
		setColour(input.nextLine());
		System.out.println("Input milage: ");
		setMilage(input.nextInt());
		System.out.println("Input year: ");
		setYear(input.nextInt());
	}
	
	public void displayMilage() {
		System.out.println("Milage: " + getMilage());
	}
	
	public void displayAllString() {
		System.out.printf("\nMake: %s\nModel: %s\nColour: %s", this.make, this.model, this.colour);
	}
	
	public void newSetYear() {
		System.out.println("Input new year: ");
		int newYear = input.nextInt();
		
		setYear(newYear);
	}
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString() {
		return "Make: " + make + "\nModel: " + model + "\nColour: " + colour + "\nMilage: " + milage + "\nYear: " + year;
	}

	public static void main(String[] args) {
		MotorVehicleInheritance motorCycle = new MotorVehicleInheritance();
		
		int option=-1;
		boolean reset=false;
		do {reset=false;
			System.out.println("Select an option: 1. Show milage, 2. Show make, model and colour, 3. Edit year");
			input.nextLine();
			
			if(input.hasNextInt()) {
				option = input.nextInt();
			}
			else {
				System.out.println("Invalid input");
				reset = true;
			}

			switch(option) {
				case 1:
					motorCycle.displayMilage();
					break;
				case 2:
					motorCycle.displayAllString();
					break;
				case 3:
					motorCycle.newSetYear();
					break;
				case -1:
					break;
				default:
					System.out.println("Invalid input");
					reset=true;
					break;
			}
		}while(reset);
		System.out.println("\n" + motorCycle);
	}
}