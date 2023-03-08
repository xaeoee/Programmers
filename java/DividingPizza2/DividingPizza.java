public class DividingPizza {
  public static void main(String[] args) {
    int people = 10;
    int slice = 6;
    int gcd = getGCD(people, slice);
    int lcm = (people * slice) / gcd;
    int result = lcm / slice;
    System.out.println(result);
  }

  static int getGCD(int num1, int num2) {
    if (num1 % num2 == 0) {
      return num2;
    }
    return getGCD(num2, num1 % num2);
  }
}