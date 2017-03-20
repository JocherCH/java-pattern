package com.jocher.javapattern.flyweight;

/**
 * Created by wubin on 2017/3/20.
 */

public class StrengthPotion implements Potion {

  @Override
  public void drink() {
    System.out.println("You feel strong. (Potion={})" + System.identityHashCode(this));

  }
}
