package inheritance;

import java.util.Scanner;

public class MotorCycleInheritance extends MotorVehicleInheritance {
	private int  wheels;
	private boolean helmet;
	
	static Scanner input = new Scanner(System.in);
	
	public MotorCycleInheritance(String make, String model, String colour, int milage, int year, boolean helmet, int wheels) {
		super(make, model, colour, milage, year); // inherit variables from the parent
		this.helmet = helmet;
		this.wheels = wheels;
	}
	
	public MotorCycleInheritance() {
		System.out.println("Enter number of wheels: ");
		setWheels(input.nextInt());
		System.out.println("Does this vehicle have a helmet (true/false): ");
		setHelmet(input.nextBoolean());
	}
	
	public void displayMilage() {
		System.out.println("Milage: " + getMilage());
	}
	
	public void displayAllString() {
		System.out.printf("\nMake: %s\nModel: %s\nColour: %s", getMake(), getModel(), getColour());
	}
	
	public void newSetYear() {
		System.out.println("Input new year: ");
		int newYear = input.nextInt();
		
		setYear(newYear);
	}
	
	public void displayWheels() {
		System.out.printf("There are: %d wheels", wheels);
	}
	
	public boolean hasHelmet() {
		return helmet;
	}
	
	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public boolean isHelmet() {
		return helmet;
	}

	public void setHelmet(boolean helmet) {
		this.helmet = helmet;
	}

	public String toString() {
		return "Make: " + getMake() + "\nModel: " + getModel() + "\nColour: " + getColour() + "\nMilage: " + getMilage() + "\nYear: " + getYear() + "\nWheels: " + getWheels() + "\nHelmet: " + isHelmet();
	}

	public static void main(String[] args) {
		MotorCycleInheritance motorCycle = new MotorCycleInheritance();
		
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
