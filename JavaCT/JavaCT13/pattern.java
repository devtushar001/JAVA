package JavaCT.JavaCT13;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        for (int i = 1; i < n-1; i++) { //rows
           for(int j = 1; j < n; j++) {
             System.out.print(i+""+j +" ");
           }
           System.out.println();
        }
        sc.close();
    }
}
