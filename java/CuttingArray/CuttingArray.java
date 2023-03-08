import java.util.*;

public class CuttingArray {
  public static void main(String[] args) {
    int[] num_list = { 1, 2, 3, 4, 5 };
    int a = 1;
    int b = 3;
    int[] new_list = Arrays.copyOfRange(num_list, a, b + 1);
    System.out.println(Arrays.toString(new_list));
  }
}