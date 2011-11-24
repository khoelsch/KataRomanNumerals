package com.coremedia.codekata;

/**
 * Created by IntelliJ IDEA.
 * User: khoelsch
 * Date: 24.11.11
 * Time: 17:41
 * To change this template use File | Settings | File Templates.
 */
public class Converter {

  public static String convertToRoman(int arab){
    return new Arab(arab).toRoman();
  }

  public static int convertToArab(String roman){
    return new Roman(roman).toArab();
  }

}
