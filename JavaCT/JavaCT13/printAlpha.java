package JavaCT.JavaCT13;

import java.util.Scanner;

public class printAlpha {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number : ");
       int num = sc.nextInt();

       for (int i = 1; i <= num; i++) {
         for (int j = 1; j<=i; j++) {
          System.out.print((char)('A'+j-1)+ " ");
         }
         System.out.println();
       }
       sc.close();
    }
}
