package com.jocher.javapattern.strategy;

/**
 * Created by wubin on 2017/3/22.
 */

public class SpellStrategy implements DragonSlayingStrategy{

  @Override
  public void execute() {
    System.out.println("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!");
  }


}
