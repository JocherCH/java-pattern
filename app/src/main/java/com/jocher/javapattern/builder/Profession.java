package com.jocher.javapattern.builder;

/**
 * Created by wubin on 2017/3/15.
 */

public enum Profession {
  WARRIOR, THIEF, MAGE, PRIEST;

  @Override
  public String toString() {
    return name().toLowerCase();
  }
}
