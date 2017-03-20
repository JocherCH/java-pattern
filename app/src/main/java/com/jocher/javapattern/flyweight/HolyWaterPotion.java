package com.jocher.javapattern.flyweight;

/**
 * Created by wubin on 2017/3/20.
 */

public class HolyWaterPotion implements Potion {

  @Override
  public void drink() {
    System.out.println("You feel blessed. (Potion={})" + System.identityHashCode(this));

  }
}
