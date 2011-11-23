import com.sun.jndi.ldap.ext.StartTlsResponseImpl;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Converts integers into Roman numerals (e.g. 7 -> "VII" ).
 * <p/>
 * You might want to have a look at the <a href="http://codingdojo.org/cgi-bin/wiki.pl?KataRomanNumerals">description of this CodeKata</a> at codingdojo.org.
 */
public class RomanNumeralConverter {
  // mapping of arabic number to roman numeral
  private final static SortedMap<Integer, String> arabicToRomanMap;

  static {
    arabicToRomanMap = new TreeMap<Integer, String>();
    arabicToRomanMap.put(1, "I");
    arabicToRomanMap.put(5, "V");
    arabicToRomanMap.put(10, "X");
    arabicToRomanMap.put(50, "L");
    arabicToRomanMap.put(100, "C");
    arabicToRomanMap.put(1000, "M");
  }

  // the order of roman numeral in DESCENDING order
  private final static int[] arabicsToConvert = {1000, 500, 100, 50, 10, 5, 1};

  private static StringBuilder resultBuilder;

  public static String convert(int arabicNumber) {
    resultBuilder = new StringBuilder();
    int rest = arabicNumber;

    for (int arabicToConvert : arabicsToConvert) {
      // calculate, how many times can this number "fit in"
      final int multiples = rest / arabicToConvert;

      if (isSpecialCase(arabicToConvert, multiples)) {
        convertSpecialCase();
      } else {
        convertNormalCase(arabicToConvert, multiples);
      }

      // calculate rest
      rest -= multiples * arabicToConvert;
    }

    return resultBuilder.toString();
  }

  private static void convertSpecialCase() {
  }

  private static void convertNormalCase(int arabicValue, int multiples) {
    final String romanNumeral = arabicToRomanMap.get(arabicValue);
    for (int i = 0; i < multiples; ++i) {
      resultBuilder.append(romanNumeral);
    }
  }

  private static boolean isSpecialCase(final int arabicValue, final int multiples) {
    return false;//(multiples == 4) // TODO
  }
}
