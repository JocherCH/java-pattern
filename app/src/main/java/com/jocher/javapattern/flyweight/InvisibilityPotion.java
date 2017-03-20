package com.jocher.javapattern.flyweight;

/**
 * Created by wubin on 2017/3/20.
 */

public class InvisibilityPotion implements Potion {

  @Override
  public void drink() {
    System.out.println("You become invisible. (Potion={})" + System.identityHashCode(this));

  }
}
