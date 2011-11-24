package com.coremedia.codekata;

/**
 * Created by IntelliJ IDEA.
 * User: khoelsch
 * Date: 24.11.11
 * Time: 17:39
 * To change this template use File | Settings | File Templates.
 */
public class Roman {
  String roman;

  public Roman(String roman) {
    this.roman = roman;
  }

  int toArab(){
    int arab = 0;
    for (Pair number : Numbers.NUMBERS) {
      while (roman.startsWith(number.getRoman())){
        arab+=number.getArab();
        roman = roman.substring(number.getRoman().length());
      }
    }
    return arab;
  }
}
