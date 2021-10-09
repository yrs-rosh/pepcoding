import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int indec = getValueIndecimal(n,sourceBase);
     System.out.print(getValueInBase(indec , destBase));
     
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