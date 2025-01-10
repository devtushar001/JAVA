package JavaCT.JavaCT19;

public class methodOverloading {
  static int x = 1;

  public static void main(String[] args) {
    System.out.println("Main asli hun");
    System.out.println(args);

    if (args.length == 5) {
      System.out.println("Done");
      return;
    }
    System.out.println(args.length);
    main(new String[x++]);

    // main();
    // main(7);
    // main(new int[5]);
    // main(8);
  }

  public static void main() {
    System.out.println("Khali vala main hun");
  }

  public static void main(int[] divesh) {
    System.out.println("int vala main hunn");
  }

  public static void main(int x) {
    System.out.println(x);
  }

  public static void main(String x) {
    System.out.println(x);
  }
}
