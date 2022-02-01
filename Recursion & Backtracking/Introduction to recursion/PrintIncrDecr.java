import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    pdi(n);
  }

  public static void pdi(int n) {
    decrease(n);
    increase(n);
  }

  public static void increase(int n) {

    if (n == 0) {
      return;
    }
    increase(n - 1);
    System.out.println(n);
  }

  public static void decrease(int n) {

    if (n == 0) {
      return;
    }
    System.out.println(n);
    decrease(n - 1);
  }

}