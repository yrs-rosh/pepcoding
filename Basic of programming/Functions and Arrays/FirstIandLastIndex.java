import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0 ; i<arr.length ; i++){
        arr[i] = sc.nextInt();
    }
    int d = sc.nextInt();
    int high = arr.length-1;
    int low = 0;
    int last = -1;
    int first = -1;
    while(low <= high){
        int mid = (low+high)/2;
        if(d > arr[mid]){
            low = mid+1;
        }else if(d < arr[mid]){
            high = mid-1;
        }else{
            last = mid;
            low = mid+1;
        }
    }
    high = last;
    low = 0;
    while(low <= high){
        int mid = (low+high)/2;
        if(d > arr[mid]){
            low = mid+1;
        }else if(d < arr[mid]){
            high = mid-1;
        }else{
            first = mid;
            high = mid-1;
        }
    }
    System.out.println(first);
    System.out.println(last);
 }

}