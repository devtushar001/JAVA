package JavaCT.JavaCT06.HomeWork;

public class homeWork01 {
  public static void main(String[] args) {

    // Checking given character is vowel or not
    char ch = 'E';
    ch = Character.toUpperCase(ch);
    if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
      System.out.println(ch + " is a vowel");
    } else {
      System.out.println(ch + " is not a vowel");
    }

    // checking given year is a leap year or not
    int year = 2024;

    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
      System.out.println(year + " is a leap year.");
    } else {
      System.out.println(year + " is not a leap year.");
    }
    // check if a circle can be converted into a rectangle of length 2*r and width of r

    // write a program to print greatest number among three numbers

    int a = 17, b = 19, c = 25;

    if ((a > b) && (a > c)) {
      System.out.println(a + " Greatest Value");
    } else if ((b > a) && (b > c)) {
      System.out.println(b + " Greatest Value");
    } else {
      System.out.println(c + " is the Greatest Value");
    }

    char character = 'f';
    // char uch = 
    int charCode = (int) character;
    if (charCode % 2 == 0) {
        System.out.println("The character " + Character.toUpperCase(character) + " has an even Unique code value");
    } else {
        System.out.println("The character  " + Character.toUpperCase(character) + " has an odd Unique code value");
    }
  }
}
