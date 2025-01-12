package JavaCT.JavaCT21;

public class abstractionOne {
  public static void main(String[] args) {
    AB a = new AB();
    CD b = new CD();

    a.show();
    a.display();
    b.show();
    b.display();
    b.show(5);
    b.display(7);

  }
}

class AB {
  public void show() {
    System.out.println("AB Show");
  }

  public void display() {
    System.out.println("AB display");
  }
}

class CD extends AB {
   public void show(int x) {
     System.out.println("CD show");
   }
   public void display(int x) {
     System.out.println("CD display");
   }
}
