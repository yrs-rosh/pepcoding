import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  int pos = 0;
  int rev =0;
  while(n>0){
      int dig = n%10;
      n = n/10;
      pos++;
      
      rev = rev + pos*(int)Math.pow(10, dig-1);
      
  }
  System.out.println(rev);
  
  
 }
}