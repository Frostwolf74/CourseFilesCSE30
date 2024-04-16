package inheritance;

public class Felinae extends Felidae {
	private String region, colour;
	
	public Felinae(String region, String colour, int jumpHeight, int biteStrength, String name, float weight, int age, String species) {
		super(jumpHeight, biteStrength, name, weight, age, species);
		this.region = region;
		this.colour = colour;
	}
	
	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
}
