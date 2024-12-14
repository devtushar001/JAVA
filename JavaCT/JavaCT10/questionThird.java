package JavaCT.JavaCT10;

public class questionThird {
   public static void main(String[] args) {
       int num = 102, sum = 0;

       while (num > 0) {
          sum += (num % 10);
          num /= 10;
       }
       if (sum % 7 == 0) System.out.println("Sum are divisible by 7");    
       else System.out.println("Sum is not divisible by 7");
       
   }
}
