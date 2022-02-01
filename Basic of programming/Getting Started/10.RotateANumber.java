import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int k = scn.nextInt();
     int temp = n;
     int num = n;
     int back = 0;
     int front = 0;
     int div = 10;
     
     int count = 0;
     
     for(int i=1 ; i<=10 ; i++){
         if(temp<=0){
             break;
         }
         temp = temp/10;
         count++;
     }
     
     if(k>=0){
         k=k % count;
         for(int j=1 ; j<=k ;j++){
         front = num/10;
         back = num%div;
         num = back*(int)Math.pow(10,count-1) + front;
        }
     }else{
         k = k * -1;
         k=k%count;
         for(int j=1 ; j<=k ;j++){
         front = num/(int)Math.pow(10,count-1);
         back = num%(int)Math.pow(10,count-1);
         num = back*10 + front;
        }
         
         
     }
     
     
     System.out.print(num);
    }
   }