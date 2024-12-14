package JavaCT.JavaCT10;

public class secondQuestion {
   public static void main(String[] args) {
    // reverse a number
      int n = 147, rev = 0;
      int m = n;
      while (n > 0) {
        rev = 10*rev + (n % 10);
        n /= 10; // n = n/10
      }
      System.out.println(rev);
      if (m == rev) System.out.println(true); 
      else System.out.println(false);
   }
}
