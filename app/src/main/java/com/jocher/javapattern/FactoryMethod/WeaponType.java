package com.jocher.javapattern.FactoryMethod;

/**
 * Created by wubin on 2017/3/15.
 */

public enum WeaponType {

  SHORT_SWORD("short sword"), SPEAR("spear"), AXE("axe"), UNDEFINED("");

  private String title;

  WeaponType(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return title;
  }

}
