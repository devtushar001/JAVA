package JavaCT.JavaCT07;

public class thirdQuestion {
   public static void main(String[] args) {
      int n = 10, x = 2;
      int even = n/2, odd = n - even;

      if (x % 2 == 0) System.out.println(even - 1);
      else System.out.println(odd - 1);
   }
}
