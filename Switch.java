 import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    
         int  n;
         System.out.println("Enter a number btween 1 to 3:");
           n = s.nextInt();
 
	 switch(n){
	     case 1:
	         System.out.println((4+2)/3);
	         break;
	     case 2:
	         System.out.println((8+8)/2);
	          break;
	     case 3:
	         System.out.println((6/2));
	          break;
	 }   
	}
}
