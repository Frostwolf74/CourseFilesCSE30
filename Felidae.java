package inheritance;

public class Felidae extends Carnivora {
	private String speciesB, colourB;
	
	public Felidae(String speciesB, String colourB, String name, float weight, int age, int length) {
		super(name, weight, age, length);
		this.speciesB = speciesB;
		this.colourB = colourB;
	}
	
	public Felidae() {
		
	}

	public String getSpeciesB() {
		return speciesB;
	}

	public void setSpeciesB(String speciesB) {
		this.speciesB = speciesB;
	}

	public String getColourB() {
		return colourB;
	}

	public void setColourB(String colourB) {
		this.colourB = colourB;
	}
	
	public static void main(String[] args) {
		
	}
}
