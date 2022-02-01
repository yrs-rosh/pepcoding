import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] arr = new int[n][n];
    for (int i = 0 ; i < arr.length ; i++) {
      for (int j = 0 ; j < arr[0].length ; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    int x = sc.nextInt();
    int k = 0;
    int l = arr[0].length - 1;
    while (k < arr.length && l >= 0) {
      if (x == arr[k][l]) {
        System.out.println(k);
        System.out.println(l);
        return;
      } else if (x > arr[k][l]) {
        k++;
      } else if (x < arr[k][l]) {
        l--;
      }
    }
    System.out.println("Not Found");
  }

}