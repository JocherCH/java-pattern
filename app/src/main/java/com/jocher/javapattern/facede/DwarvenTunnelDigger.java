package com.jocher.javapattern.facede;

/**
 * Created by wubin on 2017/3/20.
 */

public class DwarvenTunnelDigger extends DwarvenMineWorker {

  @Override
  public String name() {
    return "Dwarven tunnel digger";
  }

  @Override
  public void work() {
    System.out.println("{} creates another promising tunnel." + name());
  }
}
