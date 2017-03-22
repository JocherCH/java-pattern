package com.jocher.javapattern.state;

/**
 * Created by wubin on 2017/3/22.
 */

public class AngryState implements State {

  private Mammoth mammoth;

  public AngryState(Mammoth mammoth) {
    this.mammoth = mammoth;
  }

  @Override
  public void observe() {
    System.out.println(mammoth + "is furious!");
  }

  @Override
  public void onEnterState() {
    System.out.println( mammoth + " gets angry!");
  }

}
