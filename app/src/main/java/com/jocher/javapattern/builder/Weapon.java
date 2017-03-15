package com.jocher.javapattern.builder;

/**
 * Created by wubin on 2017/3/15.
 */

public enum Weapon {
  DAGGER, SWORD, AXE, WARHAMMER, BOW;

  @Override
  public String toString() {
    return name().toLowerCase();
  }
}
