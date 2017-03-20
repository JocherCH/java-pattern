package com.jocher.javapattern.proxy;

/**
 * Created by wubin on 2017/3/20.
 */

public class IvoryTower implements WizardTower {

  @Override
  public void enter(Wizard wizard) {
    System.out.println(wizard + " enters the tower.");
  }
}
