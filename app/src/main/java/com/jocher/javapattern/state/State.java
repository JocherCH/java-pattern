package com.jocher.javapattern.state;

/**
 * Created by wubin on 2017/3/22.
 */

public interface State {

  void onEnterState();

  void observe();

}
