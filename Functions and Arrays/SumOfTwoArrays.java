import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int arr1[] = new int[n1];
    for (int i = 0; i < arr1.length ; i++) {
      arr1[i] = scn.nextInt();
    }
    int n2 = scn.nextInt();
    int arr2[] = new int[n2];
    for (int i = 0; i < arr2.length ; i++) {
      arr2[i] = scn.nextInt();
    }
    int sum[] = new int[n1 > n2 ? n1 : n2];
    int i = arr1.length - 1;
    int j = arr2.length - 1;
    int k = sum.length - 1;
    int c = 0;
    while(k >= 0){
        int num = c;
        if(i>=0){
            num += arr1[i];
        }
        if(j>=0){
            num += arr2[j];
        }
        c = num/10;
        num = num % 10;
        sum[k] = num;
        i--;
        j--;
        k--;
    }
    if(c>0){
        System.out.println(c);
    }
    for(int nums : sum){
        System.out.println(nums);
    }
  }

}