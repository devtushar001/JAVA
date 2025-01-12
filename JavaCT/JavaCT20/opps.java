package JavaCT.JavaCT20;

public class opps {
  public static void main(String[] args) {
    P p = new P(4, 5);
    Q q = new Q(p);
    System.out.println(p.x + " " + p.y);
    System.out.println(q.x + " " + q.y + " " + q.z);
  }
}

class P {
  int x, y;

  P(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

class Q extends P {
  int z;
  Q(P obj ) {
    // this.z = Z;   // Giving a problem error
    // super(obj.x, obj.y);
    // super(5, obj.y);
    super(11, 9);
  }
}