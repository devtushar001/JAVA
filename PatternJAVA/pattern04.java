package PatternJAVA;

import java.util.Scanner;

public class pattern04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = sc.nextInt();
    for(int i = 1; i <= num; i++) {
       for(int j = 1; j <= num; j++) {
         if (i == j || i + j == num + 1 || i == 1 || i == num || j == 1 || j == num) {
           System.out.print("x ");
         } else {
           System.out.print("  ");
         }
       }
       System.out.println();
    }

    sc.close();
  }
}
