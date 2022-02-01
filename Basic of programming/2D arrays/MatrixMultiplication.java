import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int arr1[][] = new int[n][m];

    for (int i = 0 ; i < n ; i++) {
      for (int j = 0 ; j < m ; j++) {
        arr1[i][j] = sc.nextInt();
      }
    }

    int o = sc.nextInt();
    int p = sc.nextInt();

    int arr2[][] = new int[o][p];

    for (int i = 0 ; i < o ; i++) {
      for (int j = 0 ; j < p ; j++) {
        arr2[i][j] = sc.nextInt();
      }
    }

    int prd[][] = new int[n][p];

    if (m != o) {
      System.out.print("Invalid input");
      return;
    }
    for (int i = 0 ; i < n ; i++) {
      for (int j = 0 ; j < p ; j++) {
        for (int k = 0 ; k < m ; k++) {
          prd[i][j] += arr1[i][k] * arr2[k][j];
        }
      }
    }

    for (int i = 0 ; i < prd.length ; i++) {
      for (int j = 0 ; j < prd[i].length ; j++) {
        System.out.print(prd[i][j] + " ");
      }
      System.out.println();
    }

  }

}