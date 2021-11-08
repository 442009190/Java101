 import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
		//Initialize the Scanner and print a welcome message
		Scanner in = new Scanner(System.in);		System.out.println("Welcome to Rock, Paper, Scissors!");

		//Use a while(true) loop and only break the loop if the user wants to quit
		while(true) {
		
			//Get the user's move through user input
			System.out.print("What is your move? To make a move, enter rock, paper, or scissors. To quit the game, enter quit. ");
			String myMove = in.nextLine();
					System.out.println(myMove.toLowerCase());
			 char myMoo = myMove.charAt(0);
			//Check if the user wants to quit the game
			if(myMove.equals("quit")) {
				break;
			}

		 	if(!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors")) {
		 	 
			
			} else {

				//Get a random number in between 0 and 3 and convert it to an integer so that the possibilities are 0, 1, or 2
				int rand = (int)(Math.random()*3);
				
				//Convert the random number to a string using conditionals and print the opponent's move
				String opponentMove = "";
				if(rand == 0) {
					opponentMove = "rock";
				} else if(rand == 1) {
					opponentMove = "paper";
				} else {
					opponentMove = "scissors";
				}
				System.out.println("Opponent move: " + opponentMove);
					
				//Print the results of the game: tie, lose, win
				if(myMove.equals(opponentMove)) {
					System.out.println("It's a tie!");
				} else if((myMove.equals("r ") && opponentMove.equals("scissors")) || (myMove.equals("s ") && opponentMove.equals("paper")) || (myMove.equals("p ") && opponentMove.equals("rock"))) {
					System.out.println("You won!");
				} else {
					System.out.println("You lost!");
				}

			}

		}

		//Print a final message for the user
		System.out.println("Thanks for playing Rock, Paper, Scissors!");

  }
}
	 
               
               
    
    
	 
	 
