package com.jocher.javapattern.template;

/**
 * Created by wubin on 2017/3/22.
 */

public class HalflingThief {

  private StealingMethod method;

  public HalflingThief(StealingMethod method) {
    this.method = method;
  }

  public void steal() {
    method.steal();
  }

  public void changeMethod(StealingMethod method) {
    this.method = method;
  }

}
