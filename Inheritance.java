package Activity;

//Create an Object class for a motorized vehicle.
//
//This class should consist of various object variables:
//
//Make
//Model
//Colour
//Mileage
//Year
//Create 3 or more methods, to display various elements of date (ex: display mileage) or create a method that will allow the user to enter the variable data themselves.
//
//Within your main, create 2 individual objects with various data, or create two empty objects and use a method to manually enter the data.
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
	}
	
	public void method2() {
		System.out.println("This is method2");
	}
	
	public void method3() {
		System.out.println("This is method3");
	}

	public static void main(String[] args) {
		Inheritance car = new Inheritance();
	}
}

