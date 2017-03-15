package com.jocher.javapattern.prototype;

/**
 * Created by wubin on 2017/3/15.
 */

public class OrcBeast extends Beast {

  public OrcBeast() {}

  @Override
  public Beast clone() throws CloneNotSupportedException {
    return new OrcBeast();
  }

  @Override
  public String toString() {
    return "Orcish wolf";
  }

}
