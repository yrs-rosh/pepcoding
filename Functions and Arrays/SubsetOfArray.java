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
    
    int lim = (int)Math.pow(2,arr.length);
    for(int i=0 ; i<lim ; i++){
        int temp = i;
        String str = "";
        for(int j=arr.length-1 ; j>=0 ; j--){
            int num = temp%2;
            temp = temp/2;
            if(num==0){
                str = "-\t" + str;
            }else{
                str = arr[j] +"\t" + str;
            }
        }
        System.out.println(str);
    }
 }

}