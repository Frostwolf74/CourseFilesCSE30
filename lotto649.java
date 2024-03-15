package Activity;

import java.util.Random;
import java.util.Scanner;

public class lotto649 {
	static Scanner input = new Scanner(System.in);
	
//	static int[] randomizeArray(int amt) { // randomizes array without repeating digits 
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
	
	static void duplicate(int[][] ticket, int t) {
		for(int i = 0; i < 5; ++i) 
		{
			for(int j = i+1; j < 6; ++j) 
			{
				
				if(ticket[t][i] == ticket[t][j])
				{
					Random rand = new Random();
					ticket[t][i] = rand.nextInt(49-1);
					duplicate(ticket,t);
				}
				
			}
		}
	}
	
	static void generateTicket(int[][] ticket, int t) {
		for(int i = 0; i < 7; ++i) 
		{
				Random rand = new Random();
				ticket[t][i] = rand.nextInt(49-1); // i = first 6, j = bonus number
		}
		duplicate(ticket, t);
		
		sort(ticket, t);
		
	}
	
	static int[] sort(int[][] a, int tic) {
		int itemToInsert, j;
		boolean reset;

		for(int k = 1; k < a.length; k++) {
			itemToInsert = a[k]; 
			j = k-1; 
			reset = false;

			while((j >= 0) && !reset) {
				if (itemToInsert < a[tic][j] ) {
					a[tic][j + 1] = a[tic][j];
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
		
        int[][] ticket = new int[ticketAmt][7];
        
        generateTicket(ticket, i);
	}
}
