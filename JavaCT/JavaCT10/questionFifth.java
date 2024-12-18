package JavaCT.JavaCT10;

public class questionFifth {
   public static void main(String[] args) {
      int n = 153, m = 51, x = m;

      int digit = 0;
      while (m > 0) {
        digit++;
        m /= 10;
      }
      int newNumber = (int) Math.pow(10, digit)*n + x;
      System.out.println(newNumber);

      int y = newNumber, revm = 0, i = 1;

      while (newNumber > 0) {
        revm = 10*revm + (newNumber % 10);
        newNumber /= 10; // n = n/10
      }
      System.out.println(revm);
      if (revm == y)  System.out.println(true);
      else System.out.println(false);
   }
}
