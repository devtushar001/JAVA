package JavaCT.JavaCT16;

import java.util.Scanner;

public class patternThree {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = sc.nextInt();

    if (num % 2 == 0)
      num++;

    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= num; j++) {
         if ((j == 1 || j == num) && (i == 1 || i == num)) {
           System.out.print("  ");
         } else if(i == 1 || i == num || j == 1 || j == num){
              System.out.print("* ");
         }else {
          System.out.print("  ");
         }

      }
      System.out.println();
    }
    sc.close();
  }
}

