package Activity;

import java.util.Scanner;

public class Activity2 {
	private String name, address;
	private int age;
	
	static Scanner input = new Scanner(System.in);
	
	public Activity2(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	public Activity2() {		
		System.out.println("Enter name: ");
		this.name = input.next();
		input.nextLine();
		
		System.out.println("Enter address: ");
		this.address = input.next();
		input.nextLine();
		
		System.out.println("Enter age: ");
		this.age = input.nextInt();
		input.nextLine();
	}
	
	public static int birthdayAdjust(int newAge) {
		++newAge;
		return newAge;
	}
	
	public String toString(){
		return name + " lives at " + address + " and is " + age + " years old.";
	}
	
	public static void main(String[] args) {		
		Activity2 person1 = new Activity2("name1", "Address1", 1);
		Activity2 person2 = new Activity2("name2", "Address2", 2);
		
		int newPerson=0;
		
		System.out.println("Select an option: \n1. Activate birthday for person\n2. Add a new person");
		int inputNum = input.nextInt();
		if(inputNum == 1) {
			System.out.println("Select person: ");
			int i = input.nextInt();
			if(i == 1) {
				person1.age = person1.birthdayAdjust(person1.age);
			}
			else if(i == 2) {
				person2.age = person2.birthdayAdjust(person2.age);
			}
		}
		else if(inputNum == 2) {
			Activity2 person3 = new Activity2();
			System.out.println(person3.toString());
		}
		
		System.out.println(person1.toString());
		System.out.println(person2.toString());
	}
}
