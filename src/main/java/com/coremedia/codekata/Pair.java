package com.coremedia.codekata;

/**
 * Created by IntelliJ IDEA.
 * User: khoelsch
 * Date: 24.11.11
 * Time: 17:27
 * To change this template use File | Settings | File Templates.
 */
public class Pair {
  int arab;
  String roman;

  public Pair(int arab, String roman) {
    this.arab = arab;
    this.roman = roman;
  }

  public int getArab() {
    return arab;
  }

  public String getRoman() {
    return roman;
  }
}
