package newf.tref.faltu;

public class test {
    public static void main(String[] args) {
       int n = 123;
       int sum = 0;

       while (n != 0) {
          int rem = n % 10; //rem = 3
          boolean check = true; // no is prime
          for (int i = 2; i < rem; i++) {
            if (rem % i == 0) {
               check = false;
               break;
            }
          }
          if (check == true && rem != 1) {
            // javascript async nature rem != 1
             sum = sum + rem;
          }
          n = n / 10;
       }
       System.out.println(sum);
    }
}
