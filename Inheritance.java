package Activity;

import java.util.ArrayList;
import java.util.Scanner;

public class Inheritance {
	static Scanner input = new Scanner(System.in);
	
	private String make, model, colour;
	private int milage, year;
	
	public Inheritance(String make, String model, String colour, int milage, int year) {
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.milage = milage;
		this.year = year;
	}
	
	public Inheritance() {
		System.out.println("Enter make: ");
		make = input.nextLine();
		System.out.println("Enter model: ");
		model = input.nextLine();
		System.out.println("Enter colour: ");
		colour = input.nextLine();
		System.out.println("Enter milage: ");
		milage = input.nextInt();
		input.nextLine();
		System.out.println("Enter year: ");
		year = input.nextInt();
		input.nextLine();
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
		return "make: " + make + "\nmodel: " + model + "\ncolour: " + colour + "\nmilage: " + milage + "\nyear: " + year;
	}

	public void setAll() {
		System.out.println("Enter make: ");
		input.nextLine();
		this.make = input.nextLine();
		System.out.println("Enter model: ");
		this.model = input.nextLine();
		System.out.println("Enter colour: ");
		this.colour = input.nextLine();
		System.out.println("Enter milage: ");
		this.milage = input.nextInt();
		input.nextLine();
		System.out.println("Enter year: ");
		this.year = input.nextInt();
		input.nextLine();
		System.out.println(toString());
	}
	
	public void showMilage() {
		System.out.println(this.milage);
	}
	
	public void showYear() {
		System.out.println(this.year);
	}

	public static void main(String[] args) {
		Inheritance car = new Inheritance();
		System.out.println(car);
		
		int option=0; 
		boolean reset=false;
		
		do {
			reset=false;
			System.out.println("Choose an option: 1. re-input values, 2. show milage, 3. show year, 4. exit");
			
			if(input.hasNextInt()) { // check for integer
				option = input.nextInt();
			}
			else { // if input is not an integer
				System.out.println("invalid input");
				reset=true;
			}

			switch(option) {
			case 1:
				car.setAll();
				break;
			case 2:
				System.out.println(car.getMilage());
				break;
			case 3:
				System.out.println(car.getYear());
				break;
			case 4: 
				System.exit(0);
				break;
			default:
				System.out.println("invalid input");
				reset=true;
				break;
			}
		}while(reset);
		
		newArrayList();
	}
	
	public static void newArrayList() {
		ArrayList<Inheritance> carList = new ArrayList<Inheritance>();
	}
}

