import java.util.*;
    
    public class test{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner scn = new Scanner(System.in);
      int n=scn.nextInt();
      int count=0;
      int temp = n;
      
      for(int i=0 ; i<10 ; i++){
          if(temp/10 == 0){
              break;
          }
          temp=temp/10;
          count++;
          
      }
      int d = (int)Math.pow(10 , count-1);
      for(int j=0 ; j<10 ; j++){
          if(d == 0){
              break;
          }
          int a = n/d;
          System.out.println(a);
          n=n%d;
          d=d-1;
      }
     }
    }