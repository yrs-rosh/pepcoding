import java.util.*;

public class test {
  public static void main(String[] args) {
// write your code here
    Scanner scn = new Scanner(System.in);
    int low = scn.nextInt();
    int high = scn.nextInt();
    boolean check = true;
    for (int i = low;i<=high ; i++){
        for (int j = 2 ; j * j <= i ; j++) {
      if (i % j != 0) {
          check = true;
        } else {
          check = false;
          break;
        }

      }
      if (check) {
    System.out.println(i);
    }
    }
    
  }
}