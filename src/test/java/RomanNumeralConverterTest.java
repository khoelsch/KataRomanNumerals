import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class RomanNumeralConverterTest {
  @Test
  public void convertNumbersSmallerThanFive() {
    assertEquals("I", RomanNumeralConverter.convert(1));
    assertEquals("II", RomanNumeralConverter.convert(2));
    assertEquals("III", RomanNumeralConverter.convert(3));
  }

  @Test
  public void convertNumbersContainingFive() {
    assertEquals("V", RomanNumeralConverter.convert(5));
    assertEquals("VI", RomanNumeralConverter.convert(6));
    assertEquals("V", RomanNumeralConverter.convert(5));
  }

  @Test
  public void convertSingleRomanNumeralsWithRomanNumeralOne() {
    assertEquals("VI", RomanNumeralConverter.convert(6));
    assertEquals("XI", RomanNumeralConverter.convert(11));
    assertEquals("LI", RomanNumeralConverter.convert(51));
    assertEquals("CI", RomanNumeralConverter.convert(101));
    assertEquals("MI", RomanNumeralConverter.convert(1001));
  }

  @Test
  public void convertNumberWithEverySingleRomanNumeral() {
    assertEquals("MCLXI", RomanNumeralConverter.convert(1161));
  }

  @Test
  @Ignore("Subtraction rule not supported yet.")
  public void convertSpecialCaseForRomanNumeralFive() {
    assertEquals("IV", RomanNumeralConverter.convert(4));
  }
}
