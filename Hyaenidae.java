package inheritance;

public class Hyaenidae extends Carnivora {
	private String regionC, speciesC;
	
	public Hyaenidae(String regionC, String speciesC, String name, float weight, int age, int length) {
		super(name, weight, age, length);
		this.regionC = regionC;
		this.speciesC = speciesC;
	}
	
	public Hyaenidae() {
		
	}

	public String getRegionC() {
		return regionC;
	}

	public void setRegionC(String regionC) {
		this.regionC = regionC;
	}

	public String getSpeciesC() {
		return speciesC;
	}

	public void setSpeciesC(String speciesC) {
		this.speciesC = speciesC;
	}
	
	public static void main(String[] args) {
		
	}
}
