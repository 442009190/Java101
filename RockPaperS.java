  import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //this is a random letter
        String computerPlays = "rps";
        Random rnd = new Random();
        do{
            System.out.println("If you want to play enter:\n(r or R) for rock,\n(p or P) for paper,\n(s or S) for scissors\nor Enter any key to exit");
            //get the input from the scanner as string. [ User Input w3schools ]
             String X =""; 
              X = scan.nextLine();  
            //convert the string to lower case by using toLowerCase() [ String w3schools ]
              X = X.toLowerCase();
            //get first char by using charAt() [ String w3schools ]
              char X1 = X.charAt(0);
            //check the first char if it is not r, p, and s then break the loop [ if w3schools ]
              if( !X1='r'&&!X1='p'&&!X1='s')
              break;
                //use break keyword [ while w3schools ]
              else{
            //here is the computer choice
            char computerChoice = computerPlays.charAt(rnd.nextInt(computerPlays.length()));
              if(X1 == computerChoice){
                  System.out.println(X1+"won the match");
              }
              
              else
              continue;
              }
            //check & match who wins
              if(X1=(computerChoice)){
		System.out.println("It's a tie!"); 
	      }else if(X1='r'&&computerChoice='s')||(X1='s'&&computerChoice='p')||(X1='p'&&computerChoice='r'){
		      System.out.println("You won")
	      }else
		      System.out.println("You lost")

            //print new line
            System.out.println("\n\n");
        }while(true);
    }
	 
