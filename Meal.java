package inheritance;

public class Meal {
	private String foodName;
	private int foodEnergy, foodWeight;
	
	public Meal(String foodName, int foodEnergy, int foodWeight) {
		this.foodName = foodName;
		this.foodEnergy = foodEnergy;
		this.foodWeight = foodWeight;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getFoodEnergy() {
		return foodEnergy;
	}

	public void setFoodEnergy(int foodEnergy) {
		this.foodEnergy = foodEnergy;
	}

	public int getFoodWeight() {
		return foodWeight;
	}

	public void setFoodWeight(int foodWeight) {
		this.foodWeight = foodWeight;
	}
	
	public String toString() {
		return "Name: " + foodName + "\nEnergy: " + foodEnergy + "%" + "\nWeight: " + foodWeight + " kg";
	}
}
