package JavaCT.JavaCT17;

import java.util.Scanner;

public class patternOne {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number : ");
       int num = sc.nextInt();

       for(int i = 1; i <= num;i++) {
         for(int j = 1; j <= num; j++) {
            if (i == num || j == num || (i + j) == num + 1) {
              System.out.print("* ");
            } else {
              System.out.print("  ");
            }
            System.out.println();
         }
       }
       sc.close();
    }
}
