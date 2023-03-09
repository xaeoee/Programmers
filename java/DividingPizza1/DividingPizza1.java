public class DividingPizza1 {
  public static void main(String[] args) {
    int people = 15;
    int answer = 1;
    while (true) {
      if (people <= (answer * 7)) {
        System.out.println(answer);
        break;
      }
      answer++;
    }
  }
}