package JavaCT.JavaCT11;

public class secondQuestion {
    public static void main(String[] args) {
        int a = 17, b = 34,  i = Math.min(a, b);

        while (i>=1) {
           if (a % i == 0 && b%i == 0) {
               System.out.println(i); // to find gcd
               break;
           } 
           i--;
        }
        System.out.println(a*b/i); //to find the lcm
    }
}
