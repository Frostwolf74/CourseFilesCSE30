package inheritance;

public class Felidae extends Carnivora {
	private int jumpHeight, biteStrength;
	
	public Felidae(int jumpHeight, int biteStrength, String name, float weight, int age, String species) {
		super(name, weight, age, species);
		this.jumpHeight = jumpHeight;
		this.biteStrength = biteStrength;
	}
	
	public int getJumpHeight() {
		return jumpHeight;
	}

	public void setJumpHeight(int jumpHeight) {
		this.jumpHeight = jumpHeight;
	}

	public int getBiteStrength() {
		return biteStrength;
	}

	public void setBiteStrength(int biteStrength) {
		this.biteStrength = biteStrength;
	}
}
