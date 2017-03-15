package com.jocher.javapattern.AbstractFactory;

/**
 * Created by wubin on 2017/3/15.
 */

public class OrcCastle implements Castle {

  static final String DESCRIPTION = "This is the Orc castle!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }

}
