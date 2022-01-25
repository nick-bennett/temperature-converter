package edu.cnm.deepdive;

public class Converter {

  public static double convertC2F(double c) {
    return 1.8 * c + 32;
  }

  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
      double celsius = Double.parseDouble(args[i]);
      System.out.println(convertC2F(celsius));
    }
  }

}
