import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here 
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int k = scn.nextInt();
     int temp = n;
     int count =0;
     int front = 1;
     int back = 1;
     for(int i=0 ; i<=10 ; i++){
         temp=temp/10;
         count++;
         if(temp==0){
             break;
         }
     }
     if(k>0){
         front = n/(int)Math.pow(10,k);
         back = n % (int)Math.pow(10,k);
         System.out.print(back * (int)Math.pow(10,(count-k)) + front);
         
     }else{
         k=k*-1;
         front = n/(int)Math.pow(10,count-k);
         back = n % (int)Math.pow(10,count-k);
         System.out.print(back * (int)Math.pow(10,k) + front);
     }
     


    }
   }