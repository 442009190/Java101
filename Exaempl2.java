 import java.util.Scanner;
public class Exaempl2 
{
	public static void main(String[] args) {
	      Scanner input = new Scanner(System.in);
    
    int var1;
    int var2;
     System.out.println("Enter a number1:"); 
      var1 = input.nextInt();
     System.out.println("Enter a number2:");
      var2 = input.nextInt(); 
    if( var1 > var2 )
     System.out.println("var1("+var1+") is grater than var2("+var2+")");
    else
     System.out.println("var2("+var2+") is grater than var1("+var1+")");
    
    
	}
}
