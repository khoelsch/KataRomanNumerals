package com.coremedia.codekata;

/**
 * Created by IntelliJ IDEA.
 * User: khoelsch
 * Date: 24.11.11
 * Time: 17:35
 * To change this template use File | Settings | File Templates.
 */
public class Arab {
  int arab;

  public Arab(int arab) {
    this.arab = arab;
  }

  String toRoman(){
    String roman = "";
    for (Pair number : Numbers.NUMBERS) {
      while(arab > number.getArab()){
        roman.concat(number.getRoman());
        arab-=number.getArab();
      }
    }

    return roman;
  }

}
