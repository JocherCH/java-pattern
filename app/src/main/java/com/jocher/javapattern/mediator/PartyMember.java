package com.jocher.javapattern.mediator;

/**
 * Created by wubin on 2017/3/22.
 */

public interface PartyMember {

  void joinedParty(Party party);

  void partyAction(Action action);

  void act(Action action);

}
