package com.jocher.javapattern.singleton;

/**
 * Created by wubin on 2017/3/15.
 */

public class App {
  public static void main(String[] args){
    HungryLoader hungryLoader1 = HungryLoader.getINSTANCE();
    HungryLoader hungryLoader2 = HungryLoader.getINSTANCE();
    System.out.println("hungryLoader1=="+hungryLoader1.toString());
    System.out.println("hungryLoader2=="+hungryLoader2.toString());

    ThreadSafeLazyLoaded threadSafeLazyLoaded1 = ThreadSafeLazyLoaded.getINSTANCE();
    ThreadSafeLazyLoaded threadSafeLazyLoaded2 = ThreadSafeLazyLoaded.getINSTANCE();
    System.out.println("threadSafeLazyLoaded1=="+threadSafeLazyLoaded1.toString());
    System.out.println("threadSafeLazyLoaded2=="+threadSafeLazyLoaded2.toString());

    ThreadSafeDoubleCheckLazyLoaded threadSafeDoubleCheckLazyLoaded1 = ThreadSafeDoubleCheckLazyLoaded.getINSTANCE();
    ThreadSafeDoubleCheckLazyLoaded threadSafeDoubleCheckLazyLoaded2 = ThreadSafeDoubleCheckLazyLoaded.getINSTANCE();
    System.out.println("threadSafeDoubleCheckLazyLoaded1=="+threadSafeDoubleCheckLazyLoaded1.toString());
    System.out.println("threadSafeDoubleCheckLazyLoaded2=="+threadSafeDoubleCheckLazyLoaded2.toString());

    StaticInternalLoaded staticInternalLoaded1 = StaticInternalLoaded.getInstance();
    StaticInternalLoaded staticInternalLoaded2 = StaticInternalLoaded.getInstance();
    System.out.println("staticInternalLoaded1=="+staticInternalLoaded1.toString());
    System.out.println("staticInternalLoaded2=="+staticInternalLoaded2.toString());

    EnumLoaded enumLoaded1 = EnumLoaded.INSTANCE;
    EnumLoaded enumLoaded2 = EnumLoaded.INSTANCE;
    System.out.println("enumLoaded1=="+enumLoaded1.toString());
    System.out.println("enumLoaded2=="+enumLoaded2.toString());

  }
}
