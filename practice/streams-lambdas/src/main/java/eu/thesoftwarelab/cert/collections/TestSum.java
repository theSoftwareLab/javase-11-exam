package eu.thesoftwarelab.cert.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mgeorgopoulos
 */
public class TestSum {

  public static void main(String[] args) {
    List<Double> grades = new ArrayList<>(List.of(5.50, 6.00, 7.00));
    double sumDouble = grades.stream().mapToDouble(g -> g).sum();
    int sumInt = grades.stream().mapToInt(Double::intValue).sum();
    System.out.println(sumDouble + " " + sumInt);
  }

}
