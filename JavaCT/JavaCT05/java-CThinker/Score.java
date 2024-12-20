public class Score {
    public static void main(String[] args) {
        int Rmarks = 58;
        int Amarks = 98;
        int revA = (Rmarks % 10)*10 + Rmarks /10;
        int revB = (Amarks % 10)*10 + Amarks/10;
        if(Rmarks > Amarks || Rmarks > revB || revA >Amarks || revA > revB ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

}
}
