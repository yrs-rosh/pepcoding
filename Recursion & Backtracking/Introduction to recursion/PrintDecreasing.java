import java.io.*;
import java.util.*;

public class Main {
  public static void amain(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printDecreasing(n);
  }

  public static void printDecreasing(int n) {
    System.out.println(n);

    if (n <= 1) {
      return;
    }
    printDecreasing(n - 1);
  }

}