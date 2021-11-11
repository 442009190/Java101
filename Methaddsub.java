 import java.util.Scanner;
public class Main{
    static int add(int x,int y){
         return  x + y;
    }
    static int sub(int a, int s){
        return  a - s;
    }
	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("What operation do you want to do ?"+
	  "\n1-for add\n2 for sub");
        int ope = scan.nextInt();
        if(ope == 1){
          int res = add( 1, 2);
          System.out.println(res);
        }else if(ope == 2){
            int resu = sub( 1, 2);
            System.out.println(resu);
            
        }
	}
}
