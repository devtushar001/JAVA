
import java.util.*;

public class nestedifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0){
           

            if(n%5 ==0){
                System.out.println("Even and divisible by 5");
            }
           else if(n%7==0){
                System.out.println("Even and divisible by 7");
            }
            else if(n % 2 ==0){
                System.out.println("Only divisible by 2");
            }else{
                System.out.println("Even");
            }
        }else{
            
            if(n%5 ==0){
                System.out.println("Even and divisible by 5");
            }
          else  if(n%7==0){
                System.out.println("Even and divisible by 7");
            }
            else if(n % 2 ==0){
                System.out.println("Only divisible by 2");
            }
            else{
                System.out.println("Number is odd");
            }
        }
    }
}
