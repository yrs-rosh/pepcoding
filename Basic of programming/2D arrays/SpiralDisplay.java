import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int arr[][] = new int[n][m];
        for(int i = 0 ; i < arr.length ; i++){
            for(int j=0 ; j< arr[i].length ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        int count = 0;
        int minrow = 0;
        int maxrow = arr.length-1;
        int mincol = 0;
        int maxcol = arr[0].length-1;
        while(count < m*n){
            for(int i = minrow ; i<=maxrow && count<m*n ; i++){
                System.out.println(arr[i][mincol]);
                count++;
            }
            
            mincol++;
            for(int i = mincol ; i<=maxcol && count<m*n ; i++){
                System.out.println(arr[maxrow][i]);
                count++;
            }
            
            maxrow--;
            for(int i = maxrow ; i>=minrow && count<m*n ; i--){
                System.out.println(arr[i][maxcol]);
                count++;
            }
            maxcol--;
            for(int i = maxcol ; i>=mincol && count<m*n ; i--){
                System.out.println(arr[minrow][i]);
                count++;
            }
            minrow++;
            
        }
    }

}