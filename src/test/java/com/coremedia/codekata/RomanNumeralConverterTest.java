package com.coremedia.codekata;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralConverterTest {
  @Test
  public void convert_I() {
    assertEquals("I", RomanNumeralConverter.convert(1));
  }

  @Test
  public void convert_II_and_III() {
    assertEquals("II", RomanNumeralConverter.convert(2));
    assertEquals("III", RomanNumeralConverter.convert(3));
  }

  @Test
  public void convert_X_and_XX_XXX() {
    assertEquals("X", RomanNumeralConverter.convert(10));
    assertEquals("XX", RomanNumeralConverter.convert(20));
    assertEquals("XXX", RomanNumeralConverter.convert(30));
  }

  @Test
  public void convert_X_and_C_M() {
    assertEquals("C", RomanNumeralConverter.convert(100));
    assertEquals("MM", RomanNumeralConverter.convert(2000));

  }

  @Test
  public void convert_combinations_I_X_C_M() {
    assertEquals("MMCXII", RomanNumeralConverter.convert(2112));
    assertEquals("MCCCI", RomanNumeralConverter.convert(1301));

  }

  @Test
  public void convert_everything() {
    assertEquals("VI", RomanNumeralConverter.convert(6));
    assertEquals("IV", RomanNumeralConverter.convert(4));
    assertEquals("CMXCIX", RomanNumeralConverter.convert(999));

  }





}
