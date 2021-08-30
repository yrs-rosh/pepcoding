import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here 
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int count=0;
    
    for(int i=0 ; i<10 ; i++){
        int a = n/10;
        count++;
        n=a;
        if(n%10==0){
            break;
        }
    }
    int d=count;
    System.out.println(d);
   }
  }