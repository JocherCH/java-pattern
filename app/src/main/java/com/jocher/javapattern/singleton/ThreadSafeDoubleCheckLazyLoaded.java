package com.jocher.javapattern.singleton;

/**
 * Created by wubin on 2017/3/15.
 */

public class ThreadSafeDoubleCheckLazyLoaded {

  private static volatile ThreadSafeDoubleCheckLazyLoaded INSTANCE;

  private ThreadSafeDoubleCheckLazyLoaded(){}

  public synchronized static ThreadSafeDoubleCheckLazyLoaded getINSTANCE(){
    if(INSTANCE==null){
      synchronized (ThreadSafeDoubleCheckLazyLoaded.class){
        if(INSTANCE==null){
          INSTANCE = new ThreadSafeDoubleCheckLazyLoaded();
        }
      }
    }
    return INSTANCE;
  }
}
