package JavaCT.JavaCT19;

public class testOne {
   final int x = 1; // global
    public static void main(String[] args) {
      // x = 5; //can not be assigned in final int 
      int x = 5; // local
        System.out.println(x); // can not be accessed 
    }
}
