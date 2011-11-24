import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

  // roman numerals which are regardeed by the "subtraction rule"
  private final static Map<String,List<String>> subtrahendToMinuend;
  static {
    subtrahendToMinuend = new HashMap<String, List<String>>();
    subtrahendToMinuend.put("I", Arrays.asList("V", "X"));
    subtrahendToMinuend.put("X", Arrays.asList("L", "C"));
    subtrahendToMinuend.put("C", Arrays.asList("D", "M"));
  }

  private static StringBuilder resultBuilder;

  public static String convert(int arabicNumber) {
    resultBuilder = new StringBuilder();

    int restToConvert = arabicNumber;
    for (int arabicBaseValue : arabicsToConvert) {
      final int multiples = restToConvert / arabicBaseValue; // calculate, how many times can this number "fit in"

      int convertedArabicValue = 0;
      if (isSpecialCase(arabicBaseValue, restToConvert)) {
        convertedArabicValue = convertSpecialCase(arabicBaseValue);
      } else {
        convertedArabicValue = convertNormalCase(arabicBaseValue, multiples);
      }

      restToConvert -= convertedArabicValue;
    }

    return resultBuilder.toString();
  }

  private List<Integer>

  private static boolean isSpecialCase(final int arabicBaseValue, final int arabicValueToConvert) {
    // can the value to be converted be expressed as a difference between
    // a higher roman numeral and the current roman Numeral?

    final String romanNumeral = arabicToRomanMap.get(arabicValueToConvert);
    //final List<String> subtrahends =

    //return (multiples == 4)
    //        && (arabicValue <= 10);
    return false;
  }

  private static int convertSpecialCase(int arabicToConvert) {


    return 42;
  }

  private static int convertNormalCase(int arabicBaseValue, int multiples) {
    final String romanNumeral = arabicToRomanMap.get(arabicBaseValue);
    for (int i = 0; i < multiples; ++i) {
      resultBuilder.append(romanNumeral);
    }

    return multiples * arabicBaseValue;
  }
}
