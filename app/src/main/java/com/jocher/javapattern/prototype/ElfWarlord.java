package com.jocher.javapattern.prototype;

/**
 * Created by wubin on 2017/3/15.
 */

public class ElfWarlord extends Warlord {

  @Override
  protected ElfWarlord clone() throws CloneNotSupportedException {
    return new ElfWarlord();
  }

  @Override
  public String toString() {
    return "Elven warlord";
  }
}
