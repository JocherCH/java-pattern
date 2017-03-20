package com.jocher.javapattern.AbstractFactory;

/**
 * Created by wubin on 2017/3/15.
 */

public interface KingdomFactory {

  Castle createCastle();

  King createKing();

  Army createArmy();

}