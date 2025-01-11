package JavaCT.JavaCT20;

public class objects {
  public static void main(String[] args) {
    // X x = new Y();
    // X x = new Z(); // takes the behaviour of X
    // x.show();
    // x.show(5); error
    // x.show("hi"); error

    // Y x = new Z();

    // x.show();
    // x.show(5);
    // x.show("hi"); //error

    Z x = new Z(); // all accessible

    x.show();
    x.show(5);
    x.show("helllo");

    // Y y = new X(); //not possible

  }
}

class X {
  public void show() {
    System.out.println("X class");
  }

}

class Y extends X {
  public void show(int x) {
    System.out.print(x);
    System.out.println("Y class");
  }
}

class Z extends Y {
  public void show(String x) {
    System.out.print(x);
    System.out.println("Z class");
  }
}
