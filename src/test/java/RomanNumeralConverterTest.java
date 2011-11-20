import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralConverterTest {
  @Test
  public void convertSimplest() {
    Assert.assertEquals("I", RomanNumeralConverter.convert(1));
    Assert.assertEquals("II", RomanNumeralConverter.convert(2));
    Assert.assertEquals("III", RomanNumeralConverter.convert(3));
  }

  @Test
  public void convertSimpleNoSpecialCases() {
    Assert.assertEquals("VI", RomanNumeralConverter.convert(6));
    Assert.assertEquals("XI", RomanNumeralConverter.convert(11));
    Assert.assertEquals("LI", RomanNumeralConverter.convert(51));
    Assert.assertEquals("CI", RomanNumeralConverter.convert(101));
    Assert.assertEquals("MI", RomanNumeralConverter.convert(1001));
  }
}
