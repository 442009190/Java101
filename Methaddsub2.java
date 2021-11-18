 public class Main {
     
  static float  add(float x, float y, float z) {
    return x + y + z;
  }
  
  static float sub(float x, float y, float z) {
    return x - y - z;
  }
  
   static float div(float x, float y) {
    return x / y ;
  }
  public static void main(String[] args) {
    float myNum1 = add(1f,2f,4f);
    float myNum2 = sub(4f,3f,2f);
    float myNum3 = div(5f,4f);
   System.out.println(myNum1);
   System.out.println(myNum2);
   System.out.println(myNum3);
  }
}
