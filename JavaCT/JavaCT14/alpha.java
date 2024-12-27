package JavaCT.JavaCT14;

import java.util.Scanner;

public class alpha {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number : ");
       int num = sc.nextInt();

       char x = 'A';
       for(int i = 1; i <= num; i++) {
         for(int j = 1; j <= num; j++) {
            x++;
            System.out.print( (char)(x-1) +" ");
         }
         System.out.println();
       }
       sc.close();
   }
}
