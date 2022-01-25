package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConverterTest {

  static final double TOLERANCE = 0.00000001;

  static final double[] celsiusValues = {
      -40,
      0,
      100
  };

  static final double[] fahrenheitValues = {
      -40,
      32,
      212
  };

  @Test
  void convertC2F() {
    for (int testCaseIndex = 0; testCaseIndex < celsiusValues.length; testCaseIndex++) {
      double celsius = celsiusValues[testCaseIndex];
      double fahrenheit = fahrenheitValues[testCaseIndex];
      assertEquals(fahrenheit, Converter.convertC2F(celsius), TOLERANCE);
    }
  }

}