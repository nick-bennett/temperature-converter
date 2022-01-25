package edu.cnm.deepdive;

public class Converter {

  public static double convertC2F(double c) {
    return 1.8 * c + 32;
  }

  public static void main(String[] args) {
    for (String arg : args) {
      try {
        double celsius = Double.parseDouble(arg);
        System.out.printf("%.2f degrees Celsius = %.2f degrees Fahrenheit.%n", celsius, convertC2F(celsius));
      } catch (NumberFormatException e) {
        System.out.printf("%s not recognized as a number.%n", arg);
      }
    }
  }

}
