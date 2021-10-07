 import java.util.Scanner;
public class Small or large
{
	public static void main(String[] args) {
	      Scanner input = new Scanner(System.in);
    
    int var;
     System.out.println("Enter a number:"); 
      var = input.nextInt(); 
    if ( var > 0 )
     System.out.println("var - 1");
    else if(var < 0)
     System.out.println("var + 1");
    else 
    System.out.println("var");
    
	}
}
