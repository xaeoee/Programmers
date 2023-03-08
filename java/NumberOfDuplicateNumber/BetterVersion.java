import java.util.*;

public class BetterVersion {
  public static void main(String[] args) {
    int[] num_list = { 1, 2, 3, 3, 3, 3, 4, 5 };
    int count = 0;
    int n = 3;
    for (int num : num_list) {
      if (num == n)
        count++;
    }
    System.out.println(count);
  }
}