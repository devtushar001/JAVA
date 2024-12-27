package JavaCT.JavaCT14;

import java.util.Scanner;

public class line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
           for (int j = 1; j <= num; j++) {
             if (i == j) {
                System.out.print(i+""+j);
             } else {
              System.out.print(" ");
             }
            }
            System.out.println();
        }
        sc.close();
    }
}
