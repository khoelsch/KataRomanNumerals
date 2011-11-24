package com.coremedia.codekata;

import org.apache.commons.lang.StringUtils;

/**
 * Converts integers into Roman numerals (e.g. 7 -> "VII" ).
 *
 * You might want to have a look at the <a href="http://codingdojo.org/cgi-bin/wiki.pl?KataRomanNumerals">description of this CodeKata</a> at codingdojo.org.
 */
public class RomanNumeralConverter {
  public static String convert(int arabicValue) {
    String[] romanNumerals = {"I","V","X","L","C","D","M"};
    int currentDecimal;
    int counter=0;
    int rest = arabicValue;
    String buffer="";
    do {
      currentDecimal=rest%10;
      rest=rest/10;
      String subNumeral = "";
      if (currentDecimal<4) {
        subNumeral = StringUtils.repeat(romanNumerals[counter], currentDecimal);
      } else {
        switch (currentDecimal) {
          case 4: subNumeral = romanNumerals[counter]+romanNumerals[counter+1]; break;
          case 5: subNumeral = romanNumerals[counter+1]; break;
          case 6: subNumeral = romanNumerals[counter+1]+romanNumerals[counter]; break;
          case 7: subNumeral = romanNumerals[counter+1]+romanNumerals[counter]+romanNumerals[counter]; break;
          case 8: subNumeral = romanNumerals[counter+1]+romanNumerals[counter]+romanNumerals[counter]+romanNumerals[counter]; break;
          case 9: subNumeral = romanNumerals[counter]+romanNumerals[counter+2]; break;

        }
      }
      buffer=subNumeral+buffer;

      counter+=2;
    } while (rest>0);


    return buffer;

  }
}
