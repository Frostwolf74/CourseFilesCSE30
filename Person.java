package inheritance;

public class Person {
	private String name;
	private int energyL, weight;

	public Person(String name, int energyL, int weight) {
		this.name = name;
		this.energyL = energyL;
		this.weight = weight;
	}
	
	public static void main(String[] args) {
		Person bob = new Person("Bob", 50, 70);
		
		Meal mealChoice = MainMenu.printMenu();
		
		eatMeal(mealChoice);
	}
	
	public static void eatMeal(Meal meal) {
		
	}
}
