package JavaCT.JavaCT05;

public class exersize02 {
   public static void main(String[] args) {
    // System.out.println(3.51f == 3.51); // false
    // System.out.println(3 == 3.0); // true
    // System.out.println(96.4 > 96.4); // false
    // System.out.println(96.4f > 96.4); //true
    // System.out.println(3.0f > 3.0); //false
    // System.out.println(3.0f == 3.0); //true

    // int x = 027;
    // System.out.println(x);

    // System.out.println(060);
    // System.out.println(0x10);
    // System.out.println(0x1f);

    // int a = 13;
    // int b = 17;

    // int res = (a > b) ? a : b;
    // System.out.println(res);
    

    // swapping numbers
    // int n = 3, m = 6;

    // int t;
    //  t = n;
    //  n = m;
    //  m = t;
    //  System.out.println(n); //6
    //  System.out.println(m); // 3

    // using XOR operator

    //  n = n ^ m;
    //  m = n ^ m;
    //  n = n ^ m;

    //  System.out.println(n); //6
    //  System.out.println(m); //3

    int n = 12;
    System.out.println((n&(n - 1)) == 0);
    //  
    System.out.println(Integer.bitCount(n) == 1);
   }
}