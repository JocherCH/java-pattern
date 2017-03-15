package com.jocher.javapattern.singleton;

/**
 * Created by wubin on 2017/3/15.
 */

public enum  EnumLoaded {

  INSTANCE;

  @Override
  public String toString() {
    return getDeclaringClass().getCanonicalName() + "@" + hashCode();
  }
}
