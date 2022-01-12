import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] arr = new int[n][m];

    for (int i = 0 ; i < arr.length ; i++) {
      for (int j = 0 ; j < arr[0].length ; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    int s = sc.nextInt();
    int r = sc.nextInt();

    shellRotate(arr, s, r);
    display(arr);

  }

  public static void shellRotate(int[][] arr, int s, int r) {
    int[] oned = shellToOned(arr, s);
    rotateOned(oned, r);
    onedToShell(arr, s, oned);
  }

  public static int[] shellToOned(int[][] arr, int s) {
    int minr = s - 1;
    int minc = s - 1;
    int maxr = arr.length - s;
    int maxc = arr[0].length - s;
    int size = 2 * (maxr - minr + maxc - minc);

    int[] oned = new int[size];
    int idx = 0;
    for (int i = minr, j = minc ; i < maxr ; i++) {
      oned[idx] = arr[i][j];
      idx++;
    }

    for (int i = maxr, j = minc ; j < maxc ; j++) {
      oned[idx] = arr[i][j];
      idx++;
    }

    for (int i = maxr, j = maxc ; i > minr ; i--) {
      oned[idx] = arr[i][j];
      idx++;
    }

    for (int i = minr, j = maxc ; j > minr ; j--) {
      oned[idx] = arr[i][j];
      idx++;
    }

    return oned;
  }

  public static void rotateOned(int[] oned, int r) {
    r = r % oned.length;
    if (r < 0) {
      r = r + oned.length;
    }
    reverse(oned, 0, oned.length - r - 1);
    reverse(oned, oned.length - r, oned.length - 1);
    reverse(oned, 0, oned.length - 1);
  }

  public static void reverse( int[] oned, int li, int ri) {
    while (li < ri) {
      int temp = oned[li];
      oned[li] = oned[ri];
      oned[ri] = temp;
      li++;
      ri--;
    }
  }

  public static void onedToShell(int[][] arr, int s, int[] oned ) {
    int minr = s - 1;
    int minc = s - 1;
    int maxr = arr.length - s;
    int maxc = arr[0].length - s;

    int idx = 0;
    for (int i = minr, j = minc ; i < maxr ; i++) {
      arr[i][j] = oned[idx];
      idx++;
    }

    for (int i = maxr, j = minc ; j < maxc ; j++) {
      arr[i][j] = oned[idx];
      idx++;
    }

    for (int i = maxr, j = maxc ; i > minr ; i--) {
      arr[i][j] = oned[idx];
      idx++;
    }

    for (int i = minr, j = maxc ; j > minr ; j--) {
      arr[i][j] = oned[idx];
      idx++;
    }
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