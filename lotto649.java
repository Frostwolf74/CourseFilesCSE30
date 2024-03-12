package Activity;

import java.util.Random;
import java.util.Scanner;

public class lotto649 {
	static Scanner input = new Scanner(System.in);
	
//	public static int[] randomizeArray(int amt) { // randomizes array without repeating digits 
//		int[] a = new int[amt];
//		for(int i = 0; i < amt; ++i){
//			a[i] = i+1;
//		}
//
//		Random rand = new Random();
//
//        for (int i = a.length - 1; i > 0; i--) {
//            int index = rand.nextInt(i + 1);
//
//            int temp = a[i];
//            a[i] = a[index];
//            a[index] = temp;
//        }
//        return a;
//    }
	
	public static void duplicate(int[][] ticket, int t) {
		for(int i = 0; i < 6; ++i) {
			for(int j = 0; j < ticket[0].length; ++j) {
				generateTicket(ticket, t);	
			}
		}
	}
	
	public static void generateTicket(int[][] ticket, int t) {
		for(int i = 0; i < 7; ++i) {
			for(int j = 0; j < 49; ++j) {
				Random rand = new Random();
				ticket[i][j] = rand.nextInt(49-1); // i = first 6, j = bonus number
				
				duplicate(ticket, t);
				//sort(ticket); //TODO sort 2d array
			}
		}
	}
	
	public static int[] sort(int[] a) {
		int itemToInsert, j;
		boolean reset;

		for(int k = 1; k < a.length; k++) {
			itemToInsert = a[k]; 
			j = k-1; 
			reset = false;

			while((j >= 0) && !reset) {
				if (itemToInsert < a[j] ) {
					a[j + 1] = a[j];
					j--;
					if(j == -1) {
						a[0] = itemToInsert;
					}
				}
				else {
					reset = true;
					a[j + 1] = itemToInsert;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {		
        System.out.println("Enter ticket amount");
        int ticketAmt = input.nextInt();
        input.nextLine();
		
        int[][] ticket = new int[100][100];
        
        duplicate(ticket, ticketAmt);
	}
}
