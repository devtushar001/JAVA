package JavaCT.JavaCT08;

public class secondQuestion {
  public static void main(String[] args) {
    int l = 4, b = 8, r = 1;
    int aor = l * b;
    int aoc = r * r * 22 / 7;
     
    if (aoc >= aor) System.out.println(0);
    else if (aoc >= l || aoc >= b) System.out.println(1);
    else System.out.println(2);
  }
}
