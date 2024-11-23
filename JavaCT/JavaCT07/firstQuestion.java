package JavaCT.JavaCT07;

public class firstQuestion {
   public static void main(String[] args) {
    int a = 100, b = 980, x = 5;
    double withdraw = a*x + 0.5*x; // total money to cut from machine
    if (withdraw <= b && a % 5 == 0) { // checking withdraw amount should be not more than from totalamount and withdraw amount should be multiple of 5
       System.out.println(b - withdraw);
    } else { 
       System.out.println(b);
    }
   }
}
