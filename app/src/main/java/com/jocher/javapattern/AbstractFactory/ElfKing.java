package com.jocher.javapattern.AbstractFactory;

/**
 * Created by wubin on 2017/3/15.
 */

public class ElfKing implements King{

  static final String DESCRIPTION = "This is the Elven king!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }

}
