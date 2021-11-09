public class Method
{
      static int myMethod(int num) {
        if ( num % 2 == 0 )
       System.out.println("Entered number is even");
       else
       System.out.println("Entered number is odd");
  }
	public static void main(String[] args) {
	 
	 int c = 1;
		
      while(c <= +10){
          myMethod(c);
		    ++c;
	 
	  }
  }
}
