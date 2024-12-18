package JavaCT.JavaCT11;

public class firstQuestion {
   // Function to find the GCD using the Euclidean algorithm
   public static int findGCD(int a, int b) {
      while (b != 0) {
         int temp = b;
         b = a % b;  // Remainder of a divided by b
         a = temp;   // Update a to the value of b
      }
      return a;  // The GCD is the last non-zero value of a
   }

   public static void main(String[] args) {
      int num1 = 56;
      int num2 = 98;

      // Using Euclidean algorithm to find GCD
      int gcd = findGCD(num1, num2);
      System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
   }
}
