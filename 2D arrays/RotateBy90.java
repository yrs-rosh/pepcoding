import java.io.*;
import java.util.*;

public class Main {

  public static void trans(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < i; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      }
    }
  }

  public static void rowrev(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      int last = arr[i].length - 1;
      for (int j = 0; j <= last / 2; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[i][last];
        arr[i][last] = temp;
        last--;
      }
    }
  }

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[][] = new int[n][n];
    for (int i = 0 ; i < arr.length ; i++) {
      for (int j = 0 ; j < arr[0].length ; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    trans(arr);
    rowrev(arr);
    display(arr);
  }

  public static void display(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

}