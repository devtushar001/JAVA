package newf;

public class sum {
    public static void main(String[] args) {
       int num = 123456;
       int ps = 0;
       int os = 0;
       int es = 0;

       while (num != 0) {
          int rem = num % 10;
          boolean check = true;

          for (int i = 2; i < rem; i++) {
             if (rem % i == 0) {
                check = false;
             }
          }

          if (check == true && rem != 1) {
             ps = ps + rem;
          } else if (rem % 2 == 0) {
            es = es + rem;
          } else {
            os = os + rem;
          }
          n = n/10;
       }
       System.out.println(ps);
       System.out.println(os);
       System.out.println(es);
    }
}
