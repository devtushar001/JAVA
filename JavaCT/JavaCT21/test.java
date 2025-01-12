package JavaCT.JavaCT21;

public class test {
    public static void main(String[] args) {
        Father Ajay = new Father(32, "black");
        Child Anjali = new Child(Ajay, 10);  // Pass the int parameter as well
        System.out.println(Ajay.age + " " + Ajay.color);
        System.out.println(Anjali.age + " " + Anjali.color + " " + Anjali.x);
    }
}

class Father {
    int age;
    String color;

    Father(int a, String c) {
        age = a;
        color = c;  // Corrected the assignment
    }
}

class Child extends Father {
    int x;

    Child(Father f, int x) {
        super(6, f.color);  // Corrected 'Super' to 'super' and passed values
        this.x = x;
    }
}
