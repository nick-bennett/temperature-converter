package edu.cnm.deepdive;

public class Converter {

  public static double convertC2F(double c) {
    return 1.8 * c + 32;
  }

  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
      try {
        double celsius = Double.parseDouble(args[i]);
        System.out.println(convertC2F(celsius));
      } catch (NumberFormatException e) {
        System.err.printf("%s not recognized as a number.%n", args[i]);
      }
    }
  }

}
