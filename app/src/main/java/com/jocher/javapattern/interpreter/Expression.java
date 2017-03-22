package com.jocher.javapattern.interpreter;

/**
 * Created by wubin on 2017/3/22.
 */

public abstract class Expression {

  public abstract int interpret();

  @Override
  public abstract String toString();

}
