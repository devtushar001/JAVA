package JavaCT.JavaCT17;

import java.util.Scanner;

public class pattern31 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = sc.nextInt();
    for (int i = 1; i < num; i++) {
      for (int space = 1; space <= num - i; space++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= 2 * i - 1; j++) {
        if (j == 1 || j == 2 * i - 1) {
          System.out.print("* ");

        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
    for (int i = 1; i <= num; i++) {
      System.out.print("*   ");
    }
    sc.close();
  }
}
