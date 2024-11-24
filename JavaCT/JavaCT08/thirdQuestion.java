package JavaCT.JavaCT08;

public class thirdQuestion {
    public static void main(String[] args) {
        int x = 8, y = 8, z = 8;

        if ((y-x) == (z - y)) System.out.println(0);
        else if ((y < x) && (y < z)) System.out.println(2);
        else System.out.println(1);
    }
}
