package Activity;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Activity4 implements Serializable{
	private static final long serialVersionUID = 1L;
	private static final String[] path = {"C:\\JavaObjectSaveFiles\\TVSave.bin", "C:\\JavaObjectSaveFiles\\TVSave2.bin", "C:\\JavaObjectSaveFiles\\TVSave3.bin"};
	static Scanner input = new Scanner(System.in);
	
	private String brand;
	private int resW, resH;
	
	public Activity4(String brand, int resW, int resH) {
		this.brand = brand;
		this.resW = resW;
		this.resH = resH;
	}
	
	public Activity4() {
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
	
	static void writeObj(ArrayList<Activity4> list) {		
		try {
			System.out.println("Select a save slot:\\n1. slot 1\\n2. Slot 2\\n 3. Slot 3\\n\\t> ");
			int choice = input.nextInt();
			
			FileOutputStream fileOut = new FileOutputStream(path[choice-1]);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            
            objectOut.writeObject(list);
            objectOut.close();
            
            System.out.println("Saved.");
		}
		catch (Exception ex) {
			System.out.println("Error");
	        ex.printStackTrace();
	    }
	}
	
	@SuppressWarnings("unchecked")
	static void readObj(ArrayList<Activity4> list) {
		try {
			System.out.println("Select a save slot:\n1. slot 1\n2. Slot 2\n 3. Slot 3\n\t> ");
			int choice = input.nextInt();
			
			FileInputStream fileIn = new FileInputStream(path[choice-1]);
			
			try {
				ObjectInputStream objIn = new ObjectInputStream(fileIn);
				
				list = (ArrayList<Activity4>)objIn.readObject();
				
				System.out.println("Loaded.");
				for(int i = 0; i < list.size(); ++i) {
					System.out.println(list.get(i));
				}
				objIn.close();
			}
			catch (FileNotFoundException ex) {
				ex.printStackTrace();
			}
            
            System.out.println("Loaded.");
		}
		catch (Exception ex) {
			System.out.println("Error");
	        ex.printStackTrace();
	    }
	}
	
	public static void main(String[] args) {
		ArrayList<Activity4> tv = new ArrayList<Activity4>();
		
		boolean reset=true;
		
		do {
			System.out.println("Select an option: \n1. Add a new tv\n2. exit\n3. Load save");
			int option = input.nextInt();
			
			if(option == 1) {
				Activity4 tv0 = new Activity4();
				tv.add(tv0);
				
				System.out.println("Arranging TV to top...");
				tv.add(tv.get(tv.size()-1)); // temporarily duplicate most recently added element
				tv.add(tv.get(0)); // duplicate first slot to move it to the end
				tv.set(0, tv.get(tv.size()-2)); // set slot 1 to be the last element - 1
				tv.remove(tv.size()-2); // remove temporary element
			}
			else if(option == 3) {
				readObj(tv);
			}
			else {
				break;
			}
		}while(reset);
		
		//tv.get(3).resW = 1080;
		//tv.get(3).resH = 4000;
		System.out.println(tv.toString());
		
		writeObj(tv);
	}
}
