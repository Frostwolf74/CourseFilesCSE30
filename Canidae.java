package inheritance;

public class Canidae extends Carnivora{
	private String regionA, speciesA;
	
	public Canidae(String regionA, String speciesA, String name, float weight, int age, int length) {
		super(name, weight, age, length);
		this.regionA = regionA;
		this.speciesA = speciesA;	
	}
	
	public Canidae() {
		System.out.println();
	}

	public String getRegionA() {
		return regionA;
	}

	public void setRegionA(String regionA) {
		this.regionA = regionA;
	}

	public String getSpeciesA() {
		return speciesA;
	}

	public void setSpeciesA(String speciesA) {
		this.speciesA = speciesA;
	}
	
	public static void main(String[] args) {
		
	}
}
