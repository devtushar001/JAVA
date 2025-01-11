package JavaCT.JavaCT20;

public class multiLevelInheritence {
  public static void main(String[] args) {
    // multilevel inheritance in java

    X x = new X();
    Y y = new Y();
    Z z = new Z();
    
    x.show();
    // x.show(2); 
    // x.show("hi"); //giving err
     
    y.show();
    y.show(2); 
    // y.show("hi"); //giving error

    z.show();
    z.show(2); 
    z.show("hi"); // all are accessible

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
  public void show (String x) {
    System.out.print(x);
     System.out.println("Z class");
  }
}