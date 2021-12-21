 import java.util.Scanner;
public class Small or large
{
	public static void main(String[] args) { 
	         Scanner input = new Scanner(System.in);
    
    int var;
     System.out.println("Enter a number:"); 
      var = input.nextInt(); 
    if ( var > 0 )
     System.out.println("var= "+(var - 1)+"v");
    else if(var < 0)
     System.out.println("var= "+(var + 1)+"v");
    else 
    System.out.println("var="+var+"v");
    }
}
	 
