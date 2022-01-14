import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int[][] arr = new int[n][n];

    for (int i = 0; i < arr.length ; i++) {
      for (int j = 0 ; j < arr[0].length ; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    int count = 0;
    while (count < arr.length) {
      int k = 0;
      int l = count;
      while (k < arr.length && l < arr.length) {
        System.out.println(arr[k][l]);
        k++;
        l++;
      }
      count++;
    }

  }

}