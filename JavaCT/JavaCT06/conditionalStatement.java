package JavaCT.JavaCT06;

public class conditionalStatement {
    public static void main(String[] args) {
        // if (5 > 3) {
        // System.out.println(1);
        // }
        // if (3 > 2) {
        // System.out.println(2);
        // }

        // if (5 > 3) {
        // System.out.println(1);
        // }
        // else {
        // System.out.println(2);
        // }

        // if (5 < 3) System.out.println(1);
        // System.out.println(2);

        // if (5 < 3)
        //     System.out.println(1);
        // else
        //     System.out.println(2);

        // if (5 > 3) System.out.println(1);
        // if (2 < 1) System.out.println(2);
        // else System.out.println(3);



        // checking a number is greaterthen 0 or lessthen

        int num = 7;

        if (num > 0) {
            System.out.println("Greaterthen");
        } else if (num == 0) {
            System.out.println("Number is equal to 0");
        } else {
            System.out.println("Lessthen 0");
        }

        // checking sides all are equal or two sides are equal or no one are equal

        int fside = 12;
        int sside = 11;
        int tside = 12;

        if (fside == sside && sside == tside && fside == tside) {
            System.out.println("Equivelateral");
        } else if (fside == sside || sside == tside || fside == tside) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalence");
        }

       //  checking a number divisible by 3 andd 5

       int value = 15;

       if ((value % 3 == 0) && (value % 5 == 0)) {
           System.out.println( "Number is divisible by 3 and 5");
       } else {
         System.out.println( "Number is not divisible by 3 and 5");
       }
    }
}
