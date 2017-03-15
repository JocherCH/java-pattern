package com.jocher.javapattern.AbstractFactory;

/**
 * Created by wubin on 2017/3/15.
 */

public class OrcKing implements King {


  static final String DESCRIPTION = "This is the Orc king!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }

}
