public class Square {

   public static void main(String[] args) {
      int N = 16;
      int cows = N /4;
      if(N % 4 == 0){
         System.out.println("No of Animals are : " + cows);
      }else {
         System.out.println("No of Animals are : " + (cows+1));
      }
}
}