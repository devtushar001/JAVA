package JavaCT.JavaCT20;

public class singleHeritence {
  public static void main(String[] args) {
    A a = new A();
    B b = new B();

    a.show();
    b.display();
    b.show();
  }
}

class A {
  public void show() {
    System.out.println("A class");
  }
}

class B extends A {
  // display method for B class
  public void display() {
    System.out.println("B class display");
  }

  // show method for B class
  public void show() {
    System.out.println("B class show");
  }
}