package JavaCT.JavaCT14;

import java.util.Scanner;

public class box {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
          for (int j = 1; j <= n; j++) {
            if (i==n || j == n || i ==1 || j == 1) {
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
