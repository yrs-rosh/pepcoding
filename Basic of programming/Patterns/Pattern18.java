import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n = scn.nextInt();
     int high = n;
     int low = 1;
     for(int i = 1 ; i<=n ; i++){
         for(int j = 1 ; j<=n ; j++){
             if(i==1){
                 System.out.print("*\t");
             }else if(i>1 && i<=n/2){
                 if(j==high || j==low){
                     System.out.print("*\t");
                 }else{
                     System.out.print("\t");
                 }
             }else if(i>n/2){
                 if(j>=low && j<=high){
                     System.out.print("*\t");
                 }else{
                     System.out.print("\t");
                 }
             }
         }
         System.out.println();
         if(i<=n/2){
             high--;
             low++;
         }else{
             high++;
             low--;
         }
     }

 }
}