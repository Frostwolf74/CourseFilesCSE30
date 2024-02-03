package Activity;

import java.util.ArrayList;
import java.util.Scanner;

public class Activity3 {
	static Scanner input = new Scanner(System.in);
	
	private String brand;
	private int resW, resH;
	
	public Activity3(String brand, int resW, int resH) {
		this.brand = brand;
		this.resW = resW;
		this.resH = resH;
	}
	public Activity3() {
		System.out.println("Input TV brand: ");
		brand = input.next();
		input.nextLine();
		
		System.out.println("Input horizontal resolution: ");
		resW = input.nextInt();
		input.nextLine();
		
		System.out.println("Input vertical resolution: ");
		resH = input.nextInt();
	}
	
	public String toString() {
		return "(Brand: " + brand + ", Resolution: " + resW + "x" + resH + ")";
	}
	
	public static void main(String[] args) {
		ArrayList<Activity3> tv = new ArrayList<Activity3>();
		
		boolean reset=true;
		boolean hasRunOnce=false;
		
		do {
			System.out.println("Select an option: \n1. Add a new tv\n2. exit");
			int option = input.nextInt();
			
			if(option == 1) {
				Activity3 tv0 = new Activity3();
				tv.add(tv0);
				
				if(hasRunOnce == true) {
					System.out.println("Arranging TV to top...");
					tv.add(tv.get(tv.size())); // temporarily duplicate most recently added element
					tv.add(tv.get(1)); // duplicate first slot to move it to the end
					tv.set(1, tv.get(tv.size()-1)); // set slot 1 to be the last element - 1
					tv.remove(tv.size()-1); // remove temporary element
				}
				hasRunOnce = true;
			}
			else {
				break;
			}
		}while(reset);
		
		System.out.println(tv.toString());
	}
}
