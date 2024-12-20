
import java.util.*;
public class Calulator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your choice : ");
    int choice = sc.nextInt();
    System.out.println("Enter the value of a : ");
    int a = sc.nextInt();
    System.out.println("Enter the value of b : ");
    int b = sc.nextInt();
    switch (choice){
        case 1 : System.out.println( "Sumation of two : " + (a + b));
        break;
        case 2 : System.out.println( "Substraction the two : " + (a - b));
        break;
        case 3 : System.out.println("multiplation of two is : " + (a*b));
        break;
        case 4 : System.out.println("Division of two is : " + (a / b) );
        break;
        case 5 : System.out.println("modulus of two is : " + (a % b));
        break;
        
        default:System.out.println("Invaild input");
    }
  }

}
