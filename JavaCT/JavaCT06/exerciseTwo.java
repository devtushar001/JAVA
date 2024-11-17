package JavaCT.JavaCT06;

public class exerciseTwo {
  public static void main(String[] args) {
    // checking sides of triangle

    int a = 2, b = 3, c = 4;
    if (a == b && b == c && c == a)
      System.out.println("Equilateral");
    else if (a == b || b == c || c == a)
      System.out.println("Isocales");
    else
      System.out.println("Scalene");
  }
}
