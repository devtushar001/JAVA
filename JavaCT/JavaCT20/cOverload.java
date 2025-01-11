package JavaCT.JavaCT20;

public class cOverload {
  // copy constructor
  public static void main(String[] args) {
    copy a = new copy(1, 2, 3);
    copy b = new copy(a); // copy constructor
    // a.x = 7; // shallow copy
    b.x = 7; // shallow copy
    System.out.println(a.x + " " + a.y + " " + a.z);
    System.out.println(b.x + " " + b.y + " " + b.z);
  }
}

class copy {
  // static int x, y, z; // changing to deep copy remove static keyword to make
  // shallow copy
  int x, y, z; // changing to deep copy remove static keyword to make shallow copy

  copy(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  copy(copy a) {
    this.x = a.x; // instance variable
    this.y = a.y; // instance variable
    this.z = a.z; // instance variable
  }
}
