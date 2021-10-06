import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      // write your code here
      int num = 0;
      int place = 1;
      while(n>0){
          int rem = n % 10;
          num = num + rem*place;
          n = n/10;
          place *= b;
      }
      return num;
   }
  }
