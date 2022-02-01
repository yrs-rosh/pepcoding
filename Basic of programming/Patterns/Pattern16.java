import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n = scn.nextInt();
     int low=1;
     int up=2*n-1;
        for(int i=1 ; i<=n ; i++){
            int num=1;
            for(int j=1 ; j<=2*n-1 ; j++){
                if(j>low && j<up){
                    System.out.print("\t");
                }else{
                    System.out.print(num+"\t");
                }
                
                if(j<n){
                    num++;
                }else{
                    num--;
                }
            }
            System.out.println();
            low++;
            up--;
        }

 }
}
