import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Converts integers into Roman numerals (e.g. 7 -> "VII" ).
 *
 * You might want to have a look at the <a href="http://codingdojo.org/cgi-bin/wiki.pl?KataRomanNumerals">description of this CodeKata</a> at codingdojo.org.
 */
public class RomanNumeralConverter {
  private final static SortedMap<Integer,String> arabicToRomanMap;
  static {
    arabicToRomanMap = new TreeMap<Integer, String>();
    arabicToRomanMap.put(1, "I");
  }

  public static String convert(int arabicNumber) {
    final StringBuilder result = new StringBuilder();
    int rest = arabicNumber;

    while (rest > 0) {
      rest -= 1;
      result.append("I");
    }

    return result.toString();
  }
}
