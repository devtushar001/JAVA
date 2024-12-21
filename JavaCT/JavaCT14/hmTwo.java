package JavaCT.JavaCT14;

import java.util.Scanner;

public class hmTwo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = sc.nextInt();

    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= i + (i - 1); j++) {
        System.out.print(" * ");
      }
      System.out.println();
    }
    sc.close();
  }
}
