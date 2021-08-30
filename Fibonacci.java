import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // write your code here
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int f=0;
      int a=0;
      int b=1;
      System.out.println(a);
      System.out.println(b);
      
      for(int i=2 ; i<n ; i++){
          f=a+b;
          System.out.println(f);
          a=b;
          b=f;
        
      }
   }
  }