package com.jocher.javapattern.facede;

/**
 * Created by wubin on 2017/3/20.
 */

public class App {

  public static void main(String[] args) {
    DwarvenGoldmineFacade facade = new DwarvenGoldmineFacade();
    facade.startNewDay();
    facade.digOutGold();
    facade.endDay();
  }

}
