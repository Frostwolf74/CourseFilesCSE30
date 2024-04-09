package inheritance;

public class Felidae extends Carnivora {
	private int jumpHeight, biteStrength;
	
	public Felidae(int jumpHeight, int biteStrength, String name, float weight, int age, String species) {
		super(name, weight, age, species);
		this.jumpHeight = jumpHeight;
		this.biteStrength = biteStrength;
	}
	
	public Felidae() {
		System.out.println("Enter jump height (cm): ");
		jumpHeight = input.nextInt();
		System.out.println("Enter bite strength (N•M, int): ");
		biteStrength = input.nextInt(); 
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

	public static void main(String[] args) {
		Felidae Felis = new Felinae();
	}
}
