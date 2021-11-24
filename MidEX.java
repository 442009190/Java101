import java.util.Scanner;
public class  Mid
{
	public static void mid (String[] args) {
	        Scanner scan = new Scanner(System.in);
     
    float var;
        System.out.println("Floating point number 0 to 10");
      var = scan.nextInt();
      var = (var / 10 * 100 );
    if(var <0 && var >100)
		System.out.println("Error plese try again and enter a number between 0 and 10");
	else if(var < 50)
	    System.out.println("("+var+") is less than 50%");
	else
	    System.out.println("("+var+") is greater or equal than 50%");
	}
}
