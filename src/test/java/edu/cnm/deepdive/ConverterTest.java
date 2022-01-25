package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConverterTest {

  @Test
  void convertC2F() {
    assertEquals(212, Converter.convertC2F(100));
    assertEquals(32, Converter.convertC2F(0));
    assertEquals(-40, Converter.convertC2F(-40));
  }

}