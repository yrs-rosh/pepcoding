import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0 ; i < arr.length ; i++) {
      arr[i] = scn.nextInt();
    }
    int max = arr[0];
    for(int i=0 ; i<arr.length ; i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    int a = max;
    for(int i=0 ; i<max ;i++){
        for(int j=0 ; j<arr.length ; j++){
            if(arr[j]==a){
                System.out.print("*\t");
                arr[j]--;
            }else{
                System.out.print("\t");
            }
        }
        System.out.println();
        a--;
    }
    
  }

}