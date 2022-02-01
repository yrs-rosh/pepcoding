import java.io.*;
import java.util.*;

public class Main {

  public static boolean palcheck(String str) {
    int f = 0;
    int l = str.length() - 1;
    while (f <= l) {
      if (str.charAt(f) != str.charAt(l)) {
        return false;
      } else {
        f++;
        l--;
      }
    }
    return true;
  }

  public static void solution(String str) {
    //write your code here
    for (int i = 0 ; i < str.length() ; i++) {
      for (int j = i + 1; j <= str.length() ; j++) {
        String ss = str.substring(i, j);
        if (palcheck(ss) == true) {
          System.out.println(ss);
        }
      }
    }

  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    solution(str);
  }

}