import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralConverterTest {
  @Test
  public void convertsSimpleNumbers() {
    Assert.assertEquals("I", RomanNumeralConverter.convert(1));
    Assert.assertEquals("II", RomanNumeralConverter.convert(2));
    Assert.assertEquals("III", RomanNumeralConverter.convert(3));
  }
}
