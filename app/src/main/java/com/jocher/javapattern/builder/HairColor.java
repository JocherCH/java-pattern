package com.jocher.javapattern.builder;

/**
 * Created by wubin on 2017/3/15.
 */

public enum HairColor {

  WHITE, BLOND, RED, BROWN, BLACK;

  @Override
  public String toString() {
    return name().toLowerCase();
  }

}
