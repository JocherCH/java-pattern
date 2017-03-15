package com.jocher.javapattern.AbstractFactory;

/**
 * Created by wubin on 2017/3/15.
 */

public class OrcArmy implements Army{

  static final String DESCRIPTION = "This is the Orc Army!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }

}
