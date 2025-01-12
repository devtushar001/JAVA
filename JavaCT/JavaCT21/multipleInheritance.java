package JavaCT.JavaCT21;

public class multipleInheritance {
    public static void main(String[] args) {
        bacha b = new bacha();

        b.pitai();
        b.car();
        b.pyar();
        b.khana(4);

    }
}

 interface Papa {
    public void pitai();
    public void car();
}

interface Mummy {
    public void pyar();
    public void khana(int roti);
}

class bacha implements Papa, Mummy {
    public void pitai() {
      System.out.println("Papa ki pitai");
    }

    public void car() {
      System.out.println("Papa please car dedo");
    }

    public void pyar() {
      System.out.println("Mummy ka pyar");
    }

    public void khana(int roti) {
      System.out.println("Mummy 4 roti aur dedo");
    }
}