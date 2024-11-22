package newf.tref.faltu;

public class numb {
   public static void main(String[] args) {
      int n = 7;
      int firstnumber = 1;
      int secondnumber = 1;
      int sum = 0;
      if (n == 1 || n == 2) {
        System.out.println("1");
      }

      if (n >= 3) {
         for(int i = 3; i <= n; i++) {
           sum = firstnumber + secondnumber;
           firstnumber = secondnumber;
           secondnumber = sum;
         }
         System.out.println(sum);
      }
   }
}
