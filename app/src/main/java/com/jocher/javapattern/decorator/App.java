package com.jocher.javapattern.decorator;

/**
 * Created by wubin on 2017/3/20.
 */

public class App {

  public static void main(String[] args){
    Troll troll = new SimpleTroll();
    troll.attack();
    troll.fleeBattle();

    Troll clubbed = new ClubbedTroll(troll);
    clubbed.attack();
    clubbed.fleeBattle();
  }

}
