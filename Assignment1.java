   import java.util.Scanner; 
 //Yahia howsaw
 //442009190
class Main {
  public static void main(String[] args) {
    /*
Ask the user to enter two float digits. For example ( 3.5 and 11.25 )
Print the calculation for the two digits in separate lines:
Addition +
Subtraction  -
Multiplication  *
Division /
Modulus %
Grater >
Grater or equal
Less 
Less or equal
Not equal
Equal
*/
   Scanner scan = new Scanner(System.in); 
		 
 float  number1;                              
 float  number2;
	  
  System.out.println("Enter your first float  number: ");
   number1 = scan.nextFloat();
  System.out.println("Enter your second float number: ");    
   number2 = scan.nextFloat();
 
   System.out.println(number1 + number2);
   System.out.println(number1 - number2);
   System.out.println(number1 * number2);
   System.out.println(number1 / number2);
   System.out.println(number1 % number2);
   System.out.println(number1 > number2);
   System.out.println(number1 >= number2);
   System.out.println(number1 < number2);
   System.out.println(number1 <= number2);
   System.out.println(number1 != number2);
   System.out.println(number1 = number2);
 
        
  }
}
