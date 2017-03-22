package com.jocher.javapattern.momonto;

/**
 * Created by wubin on 2017/3/22.
 */

public enum StarType {

  SUN("sun"), RED_GIANT("red giant"), WHITE_DWARF("white dwarf"), SUPERNOVA("supernova"), DEAD(
      "dead star"), UNDEFINED("");

  private String title;

  StarType(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return title;
  }
}
