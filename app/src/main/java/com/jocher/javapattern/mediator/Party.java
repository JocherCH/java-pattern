package com.jocher.javapattern.mediator;

/**
 * Created by wubin on 2017/3/22.
 */

public interface Party {

  void addMember(PartyMember member);

  void act(PartyMember actor, Action action);

}
