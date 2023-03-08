import java.util.*;

public class Avgcal {
  public static void main(String[] args) {
    int[] avg = { 1, 2, 3, 4 };
    double answer = 0;
    for (int i = 0; i < avg.length; i++) {
      answer += avg[i];
    }
    System.out.println(answer / avg.length);
  }
}