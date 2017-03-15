package com.jocher.javapattern.prototype;

/**
 * Created by wubin on 2017/3/15.
 */

public class ElfMage extends Mage {

  @Override
  protected ElfMage clone() throws CloneNotSupportedException {
    return new ElfMage();
  }

  @Override
  public String toString() {
    return "Elven mage";
  }
}
