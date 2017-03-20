package com.jocher.javapattern.proxy;

/**
 * Created by wubin on 2017/3/20.
 */

public class Wizard {

  private final String name;

  public Wizard(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }

}
