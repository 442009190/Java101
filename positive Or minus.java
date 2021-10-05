	    import java.util.Scanner;
public class  Main {
    public static void main(String[] args) { 
      	Scanner var = new Scanner(System.in);
		
		   int num;
     System.out.println("Enter an Integer number:"); 
      num =  var.nextInt(); 
    if ( num < 0)
     System.out.println("N");
     
     else if( num > 0)
      System.out.println("P");
     
