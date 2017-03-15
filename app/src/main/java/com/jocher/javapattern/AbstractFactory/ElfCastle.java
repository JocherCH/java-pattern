package com.jocher.javapattern.AbstractFactory;

/**
 * Created by wubin on 2017/3/15.
 */

public class ElfCastle implements Castle {

  static final String DESCRIPTION = "This is the Elven castle!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
