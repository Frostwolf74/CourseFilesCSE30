package inheritance;

import java.util.Scanner;

public class Canini extends Canidae{
	private String earType, tailLength;
	
	static Scanner input = new Scanner(System.in);
	
	public Canini(String earType, String tailLength, String eyeColour, int furLength, String name, float weight, int age, String species) {
		super(eyeColour, furLength, name, weight, age, species);
		this.earType = earType;
		this.tailLength = tailLength;
	}
	
	public String getEarType() {
		return earType;
	}

	public void setEarType(String earType) {
		this.earType = earType;
	}

	public String getTailLength() {
		return tailLength;
	}

	public void setTailLength(String tailLength) {
		this.tailLength = tailLength;
	}
}
