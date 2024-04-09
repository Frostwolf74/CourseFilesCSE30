package inheritance;

public class Canidae extends Carnivora{
	private String eyeColour; 
	private int furLength; // cm
	
	public Canidae(String eyeColour, int furLength, String name, float weight, int age, String species) {
		super(name, weight, age, species);
		this.eyeColour = eyeColour;
		this.furLength = furLength;
	}
	
	public Canidae() {
		System.out.println("Enter eye colour: ");
		eyeColour = input.nextLine();
		System.out.println("Enter fur length (cm, int): ");
		furLength = input.nextInt();
	}
	
	public String getEyeColour() {
		return eyeColour;
	}

	public void setEyeColour(String eyeColour) {
		this.eyeColour = eyeColour;
	}

	public int getFurLength() {
		return furLength;
	}

	public void setFurLength(int furLength) {
		this.furLength = furLength;
	}
}
