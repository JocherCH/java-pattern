package com.jocher.javapattern.state;

/**
 * Created by wubin on 2017/3/22.
 */

public class PeacefulState implements State {

  private Mammoth mammoth;

  public PeacefulState(Mammoth mammoth) {
    this.mammoth = mammoth;
  }

  @Override
  public void observe() {
    System.out.println(mammoth + "{} is calm and peaceful.");
  }

  @Override
  public void onEnterState() {
    System.out.println( mammoth + "{} calms down.");
  }

}
