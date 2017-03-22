package com.jocher.javapattern.strategy;

/**
 * Created by wubin on 2017/3/22.
 */

public class MeleeStrategy implements DragonSlayingStrategy {

  @Override
  public void execute() {
    System.out.println("With your Excalibur you sever the dragon's head!");
  }
}
