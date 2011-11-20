import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class RomanNumeralConverterTest {
  @Test
  public void convertSimplest() {
    assertEquals("I", RomanNumeralConverter.convert(1));
    assertEquals("II", RomanNumeralConverter.convert(2));
    assertEquals("III", RomanNumeralConverter.convert(3));
  }

  @Test
  public void convertSimpleNoSpecialCases() {
    assertEquals("VI", RomanNumeralConverter.convert(6));
    assertEquals("XI", RomanNumeralConverter.convert(11));
    assertEquals("LI", RomanNumeralConverter.convert(51));
    assertEquals("CI", RomanNumeralConverter.convert(101));
    assertEquals("MI", RomanNumeralConverter.convert(1001));
  }

  @Test
  @Ignore
  public void convertSpecialCases() {
    assertEquals("IV", RomanNumeralConverter.convert(4));
  }
}
