import java.util.*;
class Main {
  public static void main(String[] args) {
    ArrayList<Double> rev = new ArrayList<Double>();
      rev.add(102863.0);
      rev.add(151938.0);
      rev.add(237760.0);
      rev.add(312694.0);
      rev.add(377289.0);

    ArrayList<Double> assets = new ArrayList<Double>();
      assets.add(306818.0);
      assets.add(395899.0);
      assets.add(554672.0);
      assets.add(723521.0);
      assets.add(953986.0);

    for(int i = 0 ;i < 5; i++) {
      double result = rev.get(i) / assets.get(i);
      int year = 2015 + i;
      System.out.println("Year " + year + " has an " +
      "Asset Turnover ratio of " + result);

    }
  }
}