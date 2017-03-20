package com.jocher.javapattern.facede;

/**
 * Created by wubin on 2017/3/20.
 */

public class DwarvenGoldDigger extends DwarvenMineWorker {

  @Override
  public String name() {
    return "Dwarf gold digger";
  }

  @Override
  public void work() {
    System.out.println("{} digs for gold." + name());

  }
}
