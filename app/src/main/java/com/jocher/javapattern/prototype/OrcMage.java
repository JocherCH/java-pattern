package com.jocher.javapattern.prototype;

/**
 * Created by wubin on 2017/3/15.
 */

public class OrcMage extends Mage {

  @Override
  public Mage clone() throws CloneNotSupportedException {
    return new OrcMage();
  }

  @Override
  public String toString() {
    return "Orcish mage";
  }


}
