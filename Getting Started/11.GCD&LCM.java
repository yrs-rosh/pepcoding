import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner scn = new Scanner(System.in);
      int num1 = scn.nextInt();
      int num2 = scn.nextInt();
      
      int divt = num1;
      int divr = num2;
      int rem = 0;
      
      while(divt % divr != 0){
          rem = divt % divr;
          divt = divr;
          divr = rem;
      }
      System.out.println(divr);
      System.out.println(num1*num2/divr);
      
      
     }
    }