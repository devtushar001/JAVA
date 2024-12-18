package JavaCT.JavaCT11;

public class thirdQuestion {
  public static void main(String[] args) {
    int n = 81;
    int i = 1;
        boolean isPerfectSquare = false;
        
        // While loop to check if the number is a perfect square
        while (i * i <= n) {
            if (i * i == n) {
                isPerfectSquare = true;
                break;
            }
            i++;
        }
        
        // Output the result
        if (isPerfectSquare) {
            System.out.println(n + " is a perfect square.");
        } else {
            System.out.println(n + " is not a perfect square.");
        }
  }
}
