package JavaCT.JavaCT12;

import java.util.Scanner;

public class patternProgramming {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int n = sc.nextInt();

      for(int i = 1; i <= n; i++) {
        System.out.print("*# ");
      }
      sc.close();
   }
   
}
