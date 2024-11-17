package JavaCT.JavaCT06;

public class exerciseTwo {
   public static void main(String[] args) {
      // checking sides of triangle

      int a = 4, b = 4, c = 4;
      if (a == b && b == c && c == a) System.out.println("Equilateral");
      else if (a == b || b == c || c == a) System.out.println("Isosceles");
      else System.out.println("Scalene");
   }
}
