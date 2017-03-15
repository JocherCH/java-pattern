package com.jocher.javapattern.prototype;

/**
 * Created by wubin on 2017/3/15.
 */

public class OrcWarlord extends Warlord {

  @Override
  public Warlord clone() throws CloneNotSupportedException {
    return new OrcWarlord();
  }

  @Override
  public String toString() {
    return "Orcish warlord";
  }
}
