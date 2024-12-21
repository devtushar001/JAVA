package JavaCT.JavaCT13;

import java.util.Scanner;

public class patternEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
          char x = (char)('A'+i-1);
          for (int j = 1; j <= i; j++) {
            System.out.print(x-- +" ");
          }
          System.out.println();
        }
        sc.close();
    }
}
