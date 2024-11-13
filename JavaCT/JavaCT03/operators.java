package JavaCT.JavaCT03;

public class operators {
   public static void main(String[] args) {
      // double x = 3.9847;
      // System.out.println(x);
      // int a = 4, b = 2;
      // System.out.println(a + b); //6
      // System.out.println(a - b); //2
      // System.out.println(a * b); //8
      // System.out.println(a / b); //2
      // System.out.println(a % b); //0
      // System.out.println(a+=b); //6
      // System.out.println(a-=b); //4
      // System.out.println(a*=b); //8
      // System.out.println(a/=b); //4
      // System.out.println(a%=b); //0
      // System.out.println(a>b); //true
      // System.out.println(a<b); //false
      // System.out.println(a>=b); //true
      // System.out.println(a<=b); //false
      // System.out.println(a==b); //false
      // System.out.println(a!=b); //true
      // System.out.println((5>2) && (2>3) && (4>3)); //false,
      // System.out.println((5>2) || (2>3) && (4>3)); //true, works left to right
      int x = 4;
      int y = x++;
      System.out.println(x); //5
      System.out.println(y); //4
      int z = ++x;
      System.out.println(x); //6
      System.out.println(z); //6 same as (-)

      int a = 5;
      int b = a--;
      System.out.println(a); //4
      System.out.println(b); //5

      int c = --a;
      System.out.println(a); //3
      System.out.println(c); //3
   }
}
