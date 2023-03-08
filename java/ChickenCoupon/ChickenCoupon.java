import java.util.*;

public class ChickenCoupon {
  public static void main(String[] args) {
    int chicken = 1081;
    int coupon = 10;
    int answer = 0;

    while (chicken >= coupon) {
      int chicken2 = chicken / coupon; // chicken 2 == 108
      int couponchicken = chicken % coupon; // couponchicken == 8
      chicken = chicken2 + couponchicken;

      answer += chicken2;
    }
    System.out.println(answer);
  }
}