package inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
	static Scanner input = new Scanner(System.in);

	public static Meal printMenu() {
		
		
		//menu.add(); 
		
		
		System.out.println("Select an option by name:");
		
		System.out.println("menu.size: " + menu.size());
		
		for(int i = 0; i < menu.size(); ++i) {
			System.out.println(menu.get(i));
		}
		
		String choice = input.nextLine();
		
		switch (choice) {
		case "food1":
			return food1;
		case "food2":
			return food2;
		default:
			return null;
		}
	}
}
