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
	
	public static void method1() {
		
	}
	
	public static void method2() {
		
	}
	
	public static void method3() {
		
	}

	public static void main(String[] args) {
		
	}
}

