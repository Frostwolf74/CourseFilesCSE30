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
				ticket[t][i] = rand.nextInt(49-1); // i = first 6, j = bonus number
		}
		duplicate(ticket, t);
		
		sort(ticket, t);
	}
	
	static int[][] sort(int[][] a, int tic) {
		int itemToInsert, j;
		boolean reset;

		for(int k = 1; k < a[0].length; k++) {
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
		
		//XXX DEBUG
		for(int l = 0; l < a.length-1; ++l) {
			for(int m = 0; m < a[0].length-1; ++m) {
				System.out.println(a[l][m]);
			}
		}
		return a;
	}

	public static void main(String[] args) {	
		int pool = 5000000;
		int ticketTotal = 0;
		int[][] winningTicket = new int[1+1][7];
		generateTicket(winningTicket, 1);
        
		System.out.println("Enter ticket amount");
        int ticketAmt = input.nextInt();
        ticketTotal += ticketAmt;
        input.nextLine();
		
        int[][] ticket = new int[ticketAmt+1][7];
        
        generateTicket(ticket, ticketAmt);
        
        int matchCount=0, matchBonusCount=0;
        for(int i = 0; i < ticket.length-2; ++i) { // exempt the last index for the bonus number
        	for(int j = 0; j < ticket[0].length-2; ++j) {
        		if(ticket[i][j] == winningTicket[i][j]) {
        			++matchCount;
        		}
        	}
        }
        if(ticket[0][7] == winningTicket[0][7]) {
        	++matchBonusCount;
        }
        
        System.out.printf("Your ticket matched %d number(s)", matchCount);
        System.out.print("You won ");
        
        if(matchCount == 2) {
        	System.out.println("Free Play");
        }
        else if(matchCount == 2 && matchBonusCount == 1) {
        	System.out.println("$5");
        }
        else if(matchCount == 3) {
        	System.out.println("$10");
        }
        else if(matchCount == 4) {
        	System.out.println("4% of the Prize Pool");
        }
        else if(matchCount == 5) {
        	System.out.println("5% of the Prize Pool");
        }
        else if(matchCount == 5 && matchBonusCount == 1) {
        	System.out.println("6% of the Prize Pool");
        }
        else if(matchCount == 6) {
        	System.out.println("Jackpot or 79.5% of the Prize Pool");
        	System.out.println((ticketTotal*5.00)+pool);
        }
	}
}
