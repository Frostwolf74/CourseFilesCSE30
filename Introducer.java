package inheritance;

public class Introducer{
	public static void introducer(Carnivora Animal) {
		System.out.println("Kingdom: Animalia\nOrder:Carnivora"); // shared information
		
		// name weight age length. eyeColour furLength, earType tailLength. jumpHeight biteStrength, region colour
		
		System.out.println("Name: " + Animal.getName() + "\nWeight: " + Animal.getWeight() + " kg" + "\nAge: " + Animal.getAge() + "\nSpecies: " + Animal.getSpecies()); // from main parent 
		
		if(Animal instanceof Canidae) {
			System.out.println("Family: Canidae");	
			System.out.println("Eye colour: " + ((Canidae) Animal).getEyeColour() + "\nFur length: " + ((Canidae) Animal).getFurLength() + " mm");
			
			if(Animal instanceof Canini) {
				System.out.println("Tribe: Canini");
				System.out.println("Ear type: " + ((Canini) Animal).getEarType() + "\nTail length: " + ((Canini) Animal).getTailLength());
			}
		}
			
		if(Animal instanceof Felidae) {
			System.out.println("Family: Animal");
			System.out.println("Jump Height: " + ((Felidae) Animal).getJumpHeight() + " cm" + "\nBite Strength: " + ((Felidae) Animal).getBiteStrength() + " N•M");
			
			if(Animal instanceof Felinae) {
				System.out.println("Tribe: Animal");
				System.out.println("Region: " + ((Felinae) Animal).getRegion() + "\nCoat Colour: " + ((Felinae) Animal).getColour());
			}
		}
		System.out.println("------------------------");
	}
}
