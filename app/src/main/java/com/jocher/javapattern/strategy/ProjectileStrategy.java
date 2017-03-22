package com.jocher.javapattern.strategy;

/**
 * Created by wubin on 2017/3/22.
 */

public class ProjectileStrategy implements DragonSlayingStrategy {

  @Override
  public void execute() {
    System.out.println("You shoot the dragon with the magical crossbow and it falls dead on the ground!");
  }
}
