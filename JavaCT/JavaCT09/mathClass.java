package JavaCT.JavaCT09;

public class mathClass {
    public static void main(String[] args) {
       int a = 7, b = 13,c = 11;
       double result = Math.max(a, c);  // comparing two numbers by using math class
       System.out.println(result); 
       double res2 = Math.max(a, Math.max(b, c)); // comparing three numbers by using nested methods
       System.out.println(res2);
       System.out.println(Math.min(a, Math.min(b, c) )); // 7 
       System.out.println(Math.pow(a, b) + " Power"); // 9.6889010407
       System.out.println(Math.cbrt(c)); // 2.2239800905693157 returns double datatypes value
       System.out.println(Math.sqrt(100));  // 10 square root of 100 in double datatypes
       System.out.println(Math.pow(2, 3));  // 8
       System.out.println(Math.abs(-5));  // 5
    }
}
