package com.jocher.javapattern.singleton;

/**
 * Created by wubin on 2017/3/15.
 */

public class StaticInternalLoaded {

  private StaticInternalLoaded(){}

  public static StaticInternalLoaded getInstance(){
    return SingletonHolder.INSTANCE;
  }


  private static class SingletonHolder{
    private static StaticInternalLoaded INSTANCE = new StaticInternalLoaded();
  }

}
