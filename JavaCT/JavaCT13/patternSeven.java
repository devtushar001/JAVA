package JavaCT.JavaCT13;

import java.util.Scanner;

public class patternSeven {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number : ");
       int num = sc.nextInt();

       char x = 'a';
       for (int i = 1; i <= num; i++) {
          for(int j = 1; j <= i; j++) {
             System.out.print(x++ + " ");
          }
          System.out.println();
       }
       sc.close();
   }
}
