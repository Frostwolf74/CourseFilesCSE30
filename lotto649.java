package Activity;

import java.util.Random;

public class lotto649 {
	static int[] randomizeArray(int amt) { // randomises array without repeating digits 
		int[] a = new int[amt];
		for(int i = 0; i < amt; ++i){
			a[i] = i+1;
		}
		
		// XXX debug
		System.out.println("Original array: ");
		for(int i = 0; i < a.length; ++i) {
			System.out.println(a[i]);
		}
		
		Random rand = new Random();

        for (int i = a.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);

            int temp = a[i];
            a[i] = a[index];
            a[index] = temp;
        }
        return a;
    }
	
	static void generateTicket(int[][] tickets, int t) {
		for(int i = 0; i < tickets.length; ++i) {
			double rand = (Math.random() * 49) + 1;
			
		}
		
//		for(i; i < tickets.length; ++i)
//			Random rand = new Random()%49-1
//					checkDuplicate(tickets, t)
//					sort()

	}
	
	public static void main(String[] args) {		
		int[] out = randomizeArray(49);
        
        System.out.println("Randomized array: ");
        
        for(int i=0; i < out.length; i++) {
        	System.out.println(out[i]);
        }
        
        System.out.println("Winning numbers: ");
        
        int[] winningNumbers = new int[6];
        for(int i=0; i < winningNumbers.length; ++i) { // picking 6
        	winningNumbers[i] = out[i];        
        }
        
        // XXX debug print
        for(int i=0; i < winningNumbers.length; ++i) {
        	System.out.println(winningNumbers[i]);
        }
	}
	
}
