package JavaCT.JavaCT15;

import java.util.Scanner;

public class hmTwo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = sc.nextInt();

    if (num % 2 == 0)
      num++;

    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= num; j++) {
        if (j == 1 || i == 1 || i == num || i == (num + 1) / 2) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
    sc.close();
  }
}
