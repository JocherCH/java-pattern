package com.jocher.javapattern.singleton;

/**
 * Created by wubin on 2017/3/15.
 */

public class HungryLoader {

  private HungryLoader(){}

  private static HungryLoader INSTANCE = new HungryLoader();

  public static HungryLoader getINSTANCE(){
    return INSTANCE;
  }

}
