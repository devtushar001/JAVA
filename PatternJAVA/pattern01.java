package PatternJAVA;
import java.util.Scanner;
public class pattern01 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number : ");
         int num = sc.nextInt();
         for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= num; j++) {
                System.out.print("x ");
            }
            System.out.println();
         }

         sc.close();
    }
}
