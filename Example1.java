import java.util.Scanner;
public class Example {
    public static void main(String[] args) { 
      	Scanner myvar = new Scanner(System.in);
		
		float scan;
		System.out.print("Enter a Number From 0 to 100 :");
		scan = myvar.nextFloat();
		// ( 90 , 100 ) print A
		if (scan >=90 && scan<=100) {
		    System.out.println("A"); }
		// ( 80 , 90 ] print B
		else if (scan >=80 && scan<=90) {
		    System.out.println("B"); }
		//( 70 , 80 ] print c
		else if (scan >=70 && scan<=79) {
		    System.out.println("C"); }
		//( 60 , 70 ] print d
		else if (scan >=60 && scan<=70) {
		    System.out.println("D"); }
		 // ( 0 , 60 ] print f   
		else if (scan >=0 && scan<=60) {
		    System.out.println("F"); }
       
        
        
         
         
        
