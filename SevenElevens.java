//Aditya Bilawar
//Period 6

import java.util.*;

public class SevenElevens {
	 
     
	 public static void roll(int n, int b) {
         // Roll the dice by setting each of the dice to be
         // a random number between 1 and 6.
		 int numOfRolls = 1;
		 int point = n;
		 int money = b;
		for (int i = 0; i <= 1; i++) {
     int die1 = (int)(Math.random()*6) + 1;
     int die2 = (int)(Math.random()*6) + 1; 
     int total = die1 + die2;
     if( total == 7 || total ==12 ) {
    	 point += money; 
    	 System.out.println("You rolled: " + total + " on your first try!\nYou Won $" + money + "\nwith a total balance of $" + point );
    	 break;
     } else if (total == 2 || total == 3 || total == 12) {
    	 point -= money;
    	 System.out.println("You rolled: " + total + " on your first try \nYou Lose $" + money + "\nwith a total balance of $" + point);
    	 break;
     }
     
     else {
    	
    	 for (int a = 0; a <= 1; a++) {
    		 
    		 
    		 int die11 = (int)(Math.random()*6) + 1;
    	     int die22 = (int)(Math.random()*6) + 1; 
    	     int total1 = die11 + die22;
    	     
    	     if (total1 == total) {
    	    	 point += money; 
    	    	 System.out.println("You win $" + money + "\nwith a total balance of $" + point + " as you rolled the same number twice: " + total1 + " = " + total);
    	    	 break;
    	     } else if (total1 == 7) {
    	    	 point -= money;
    	    	 System.out.println("You lose $" + money + "\nwith a total balance of $" + point  + " as you rolled twice and got 7 on your second try \t your dice total: " + total1);
    	    	 break;
    	     }
    	    
    	 }
    	break;
    	 
     }
    	 
		
		}
     
    
 }
	 
	
   
	

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);  
		    System.out.println("Enter # of Bankrolls in dollars:");

		    int bankRoll = scan.nextInt();  
		    System.out.println("# of Bankrolls is: "  + bankRoll ); 
		    
		    System.out.println("Enter your bet amount:");

		    int bets = scan.nextInt();  
		    System.out.println("# of bets is: "  + bets );
		    roll(bankRoll, bets);
	
	}

}
