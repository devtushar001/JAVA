public class radius {
   public static void main(String[] args) {
    int l = 200,b=200,r=7 ;
    int Aoc = 22*r*r/7;
    int Aor = l *b;
    if(Aoc >= Aor){
        System.out.println("0");
    }else if(l <=Aoc || b <=Aoc){
        System.err.println("1");
    }else{
        System.out.println("2");
    }
   } 
}
