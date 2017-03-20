package com.jocher.javapattern.flyweight;

/**
 * Created by wubin on 2017/3/20.
 */

public class PoisonPotion implements Potion {

  @Override
  public void drink() {
    System.out.println("Urgh! This is poisonous. (Potion={})" + System.identityHashCode(this));

  }
}
