import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     
     for(int i=0 ; i<10 ;i++){
         if(n==0){
             break;
         }
         int a=n%10;
         System.out.println(a);
         n=n/10;
     }
    }
   }