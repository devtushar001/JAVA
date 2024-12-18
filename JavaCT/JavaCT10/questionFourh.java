package JavaCT.JavaCT10;

public class questionFourh {
   public static void main(String[] args) {
      // int num = 113;
    
      // boolean prime = true;
      // for (int i = 2; i < num; i++) {
      //   if (num % i == 0) {
      //      prime = false;
      //   } 
      //   break;
      // }
      // if (prime) System.out.println("Number is prime");
      // else System.out.println("Number is not prime");

      int num = 113, i = 1, count = 0;

      while (i<=num) {
        if(num % i == 0) count++;
        i++;
      }
      if (count == 2) System.out.println("Number " +num+ " is prime");
      else System.out.println("Number " +num+ " is not prime");
   }
}
