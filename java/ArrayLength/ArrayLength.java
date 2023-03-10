import java.util.*;

public class ArrayLength {
  public static void main(String[] args) {
    String[] strlist = { "app", "apple", "banana" };
    int[] answer = new int[strlist.length];
    for (int i = 0; i < strlist.length; i++) {
      answer[i] = strlist[i].length();
    }
    System.out.println(Arrays.toString(answer));
  }

}
