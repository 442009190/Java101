import java.util.Scanner;
public class   Smallest {
    public static void main(String[] args) { 
      	Scanner one = new Scanner(System.in);
           
        System.out.println("Enter a numbar");
           int var1 = one.nextInt();
           int var2 = one.nextInt();
           int var3 = one.nextInt();
         int smallest = var1; 
         
        if(smallest > var2)
         smallest = var2;
        if(smallest > var3)
         smallest = var3;
         System.out.println(smallest);
