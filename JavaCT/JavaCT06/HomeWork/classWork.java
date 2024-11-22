package JavaCT.JavaCT06.HomeWork;

public class classWork {
  public static void main(String[] args) {

    char ch = 'e';
    if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
      System.out.println(ch + " is vovel");
    } 
    int year = 1600;

    if (year % 400 == 0)
      System.out.println("Leap Year");
    else if (year % 4 == 4 && year % 100 != 0)
      System.out.println("Leap Year");
    else
      System.out.println("Not Leap Year");

      int r = 7;
      int l = 2*r;
      int b = r;
      System.out.println((l * b) == (22 * r * r/7));

      char cha = 'a';

      if (cha % 2 == 0) System.out.println("Even");
      else System.out.println("Odd");
  }
}
