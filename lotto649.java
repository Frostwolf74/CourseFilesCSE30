package Activity;

import java.util.Random;
import java.util.Scanner;

public class lotto649 {
	static Scanner input = new Scanner(System.in);
	
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
				ticket[t][i] = rand.nextInt(49+1); // i = first 6, j = bonus number
		}
		duplicate(ticket, t);
		
		sort(ticket, t);
	}
	
	static void sort(int[][] a, int tic) {
		int itemToInsert, j;
		boolean reset;

		for(int k = 1; k < a[0].length-1; k++) {
			itemToInsert = a[tic][k]; 
			j = k-1; 
			reset = false;

			while((j >= 0) && !reset) {
				if (itemToInsert < a[tic][j] ) {
					a[tic][j + 1] = a[tic][j];
					j--;
					if(j == -1) {
						a[tic][j + 1] = itemToInsert;
					}
				}
				else {
					reset = true;
					a[tic][j + 1] = itemToInsert;
				}
			}
		}

	}

	public static void main(String[] args) {	
		int pool = 5000000;
		int i=0;
		int[][] winningTicket = new int[1][7];
		generateTicket(winningTicket, 0);
		
		// print winning ticket XXX
		System.out.print("Winning Ticket #: ");
    	for(int j=0;j<7;j++)
    	{
    		System.out.print(winningTicket[0][j] + " ");   		
    	}
    	System.out.print("\n");
        
		System.out.println("Enter ticket amount");
        int ticketAmt = input.nextInt();
        input.nextLine();
		
        int[][] ticket = new int[ticketAmt][7];
       
        for(i=0;i<ticketAmt;i++)
        {
        	generateTicket(ticket, i);
        	System.out.print("Ticket #" + (i+1) + ": ");
        	for(int j=0;j<7;j++)
        	{
        		if(j == 6)
        		{
        			System.out.print("[" + ticket[i][j] + "] ");
        		}
        		else
        		{
        			System.out.print(ticket[i][j] + " ");
        		}
        		
        	}
        	System.out.print("\n");
        }
        
        //int matchCount=0, matchBonusCount=0, matchIndex=0, matchBonusIndex=0;
        int[] matchCount = new int[ticketAmt], matchBonusCount = new int[ticketAmt];
        
        for(i = 0; i < ticketAmt; ++i) { // exempt the last index for the bonus number
        	for(int j = 0; j < 6; ++j) {
        		for(int k = 0; k<6;k++)
        		{
        			if(ticket[i][j] == winningTicket[0][k]) {
        				matchCount[i]++;
        			}
        		}
        		
        		if(ticket[0][6] == winningTicket[0][6]) {
        				matchBonusCount[i]++;
        			}
        		
        	}
        	
        	
         }	
        	for(int l = 0; l < matchCount.length; ++l) {

        		if(matchCount[l] > 1)
        		{
        			System.out.println("Ticket #"+ (l+1)+" has "+ matchCount[l]+ " matches");
        		}
        		
        	}
       
       
        
        System.out.printf("Your ticket matched %d number(s) and %d bonus numbers.", matchCount, matchBonusCount);
        System.out.print(" You won ");
        
//        if(matchCount == 2) {
//        	System.out.println("Free Play");
//        }
//        else if(matchCount == 2 && matchBonusCount == 1) {
//        	System.out.println("$5");
//        }
//        else if(matchCount == 3) {
//        	System.out.println("$10");
//        }
//        else if(matchCount == 4) {
//        	System.out.println("4% of the Prize Pool");
//        }
//        else if(matchCount == 5) {
//        	System.out.println("5% of the Prize Pool");
//        }
//        else if(matchCount == 5 && matchBonusCount == 1) {
//        	System.out.println("6% of the Prize Pool");
//        }
//        else if(matchCount == 6) {
//        	System.out.println("Jackpot or 79.5% of the Prize Pool");
//        	System.out.println((ticketAmt*5.00)+pool);
//        }
//        else {
//        	System.out.println("None");
//        }
	}
}
