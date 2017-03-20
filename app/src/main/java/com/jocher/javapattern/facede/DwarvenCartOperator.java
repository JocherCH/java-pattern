package com.jocher.javapattern.facede;

/**
 * Created by wubin on 2017/3/20.
 */

public class DwarvenCartOperator extends DwarvenMineWorker {

  @Override
  public String name() {
    return "Dwarf cart operator";
  }

  @Override
  public void work() {
    System.out.println("{} moves gold chunks out of the mine." + name());

  }
}
