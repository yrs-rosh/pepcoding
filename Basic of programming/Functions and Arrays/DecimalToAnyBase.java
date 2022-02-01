import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
       int place = 1;
       int num = 0;
       
       while(n>0){
           int digit = n % b;
           num = num + (digit * place);
           place = place * 10;
           n = n/b;
       }
       return num;
   }
  }