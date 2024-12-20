import java.util.*;
public class s_witch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
            case 1 : System.out.println("Mondey");
            break;
            case 2 : System.out.println("Tuesday");
            break;
            case 3 : System.out.println("Wedesday");
            break;
            case 4 : System.out.println("Tuesday");
            break;
            case 5 : System.out.println("Friday");
            break;
              case 6 : System.out.println("Saturday");
            break;
            case 7 : System.out.println("Sunday");
            break;
            default:System.out.println("Invaild input");

        }
    }
}