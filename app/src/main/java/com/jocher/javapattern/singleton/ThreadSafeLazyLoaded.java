package com.jocher.javapattern.singleton;

/**
 * Created by wubin on 2017/3/15.
 */

public class ThreadSafeLazyLoaded {

  private static ThreadSafeLazyLoaded INSTANCE;

  private ThreadSafeLazyLoaded(){}

  public synchronized static ThreadSafeLazyLoaded getINSTANCE(){
    if(INSTANCE==null){
      INSTANCE = new ThreadSafeLazyLoaded();
    }
    return INSTANCE;
  }

}
