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
        
		System.out.println("Enter ticket amount");
        int ticketAmt = input.nextInt();
        input.nextLine();
		
        int[][] ticket = new int[ticketAmt][7];
       
        for(i=0;i<ticketAmt;i++)
        {
        	generateTicket(ticket, i);
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
        	System.out.print("Ticket #" + (l+1) + ": ");
        	if(matchCount[l] == 2) {
        		System.out.println("You won a free play");
        	}
        	else if(matchCount[l] == 2 && matchBonusCount[l] > 0) {
        		System.out.println("You won $5");
        	}
        	else if(matchCount[l] == 3) {
        		System.out.println("You won $10");
        	}
        	else if(matchCount[l] == 4) {
        		System.out.println("You won 4% of the prize pool"); // TODO
        	}
        	else if(matchCount[l] == 5) {
        		System.out.println("You won 5% of the prize pool"); // TODO	
        	}
        	else if(matchCount[l] == 5 && matchBonusCount[l] > 1) {
        		System.out.println("You won 6% of the prize pool");
        	}
        	else if(matchCount[l] == 6) {
        		System.out.println("You won the jackpot or 79.5% of the Prize Pool");
            	System.out.println((ticketAmt*5.00)+pool);
        	}
        	else {
        		System.out.println("None");
        	}
        }   
	}
}
