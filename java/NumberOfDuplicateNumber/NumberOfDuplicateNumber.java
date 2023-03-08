import java.util.*;

public class NumberOfDuplicateNumber {
  public static void main(String[] args) {
    int[] num_list = { 1, 2, 3, 3, 3, 3, 4, 5 };
    int count = 0;
    int number = 3;
    for (int i = 0; i < num_list.length; i++) {
      if (num_list[i] == number) {
        count++;
      }
    }
    System.out.println(count);
  }
}