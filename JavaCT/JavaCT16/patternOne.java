package JavaCT.JavaCT16;

import java.util.Scanner;

public class patternOne {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = sc.nextInt();

    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= num; j++) {
        // condition i == 1 || i == num || j == 1
        if (j == 1 && (i == 1 || i == num)) System.out.print("  ");
          if (i == 1 || i == num || j == 1) {
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
