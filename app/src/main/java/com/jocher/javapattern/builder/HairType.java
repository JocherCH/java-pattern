package com.jocher.javapattern.builder;

/**
 * Created by wubin on 2017/3/15.
 */

public enum HairType {

  BALD("bald"), SHORT("short"), CURLY("curly"), LONG_STRAIGHT("long straight"), LONG_CURLY(
      "long curly");

  private String title;

  HairType(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return title;
  }
}
