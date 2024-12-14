package JavaCT.JavaCT10;

public class questionOne {
   public static void main(String[] args) {
       int num = 7;
       System.out.println(num * (num + 1) / 2); 

       int i = 1, n = 50, sum = 0;
       while (i <= n) {
          sum += i;
          i++;
       }
       System.out.println("sum of " + n+ " natural number is : "+sum);

       int j = 1, m = 5, prod = 1;
       while (j<=m) {
          prod *= j;
          j++;
       }
       System.out.println(prod);
   }
}
