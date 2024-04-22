package inheritance;

public class Food extends Meal {
	private int temp;
	
	public Food(String foodName, int foodEnergy, int foodWeight, int temp) {
		super(foodName, foodEnergy, foodWeight);
		this.temp = temp;		
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}
	
	@Override
	public String toString() {
		return "Name: " + getFoodName() + "\nEnergy: " + getFoodEnergy() + "%" + "\nWeight: " + getFoodWeight() + " g" + "\nTemperature: " + getTemp() + "°C";
	}
}
