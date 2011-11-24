package com.coremedia.codekata;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: khoelsch
 * Date: 24.11.11
 * Time: 17:28
 * To change this template use File | Settings | File Templates.
 */
public class Numbers {
  public static final java.util.List<Pair> NUMBERS;

  static {
    NUMBERS = new ArrayList<Pair>();
    NUMBERS.add(new Pair(1000,"M"));
    NUMBERS.add(new Pair(900,"CM"));
    NUMBERS.add(new Pair(500,"D"));
    NUMBERS.add(new Pair(400,"CD"));
    NUMBERS.add(new Pair(100,"C"));
    NUMBERS.add(new Pair(90,"XC"));
    NUMBERS.add(new Pair(50,"L"));
    NUMBERS.add(new Pair(40,"XL"));
    NUMBERS.add(new Pair(10,"X"));
    NUMBERS.add(new Pair(9,"IX"));
    NUMBERS.add(new Pair(5,"V"));
    NUMBERS.add(new Pair(4,"IV"));
    NUMBERS.add(new Pair(1,"I"));
  }
}
