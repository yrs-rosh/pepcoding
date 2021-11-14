import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0 ; i<arr.length ; i++){
        arr[i] = sc.nextInt();
    }
    
    int max = arr[0];
    for(int i=0 ; i<arr.length ; i++){
        if(arr[i] > max){
            max=arr[i];
        }
    }
    int count = 1;
    for(int i=0 ; i<max ;i++){
        for(int j=0 ; j<n ; j++){
            if(arr[j]>=count){
                System.out.print("*\t");
            }else{
                System.out.print("\t");
            }
        }
        count++;
        System.out.println();
    }
  }

}