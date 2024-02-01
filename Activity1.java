package test;

import java.util.Scanner;

public class Activity1 {
	public static void main(String[] args) {
		String[] name = {"NameOne", "NameTwo", "NameThree", "NameFour", "Name Five"};
		int[] age = new int[name.length];
		
		Scanner input = new Scanner(System.in);
		
		int i;
		
		for(i = 0; i < name.length; ++i) {
			System.out.printf("Input age for %s\n", name[i]);
			age[i] = input.nextInt();
		}
		
		for(i = 0; i < age.length; ++i) {
			System.out.println(name[i] + ": " + age[i]);
		}
	}
}
