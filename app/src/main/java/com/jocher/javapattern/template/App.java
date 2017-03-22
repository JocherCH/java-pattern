package com.jocher.javapattern.template;

/**
 * Created by wubin on 2017/3/22.
 */

public class App {

  public static void main(String[] args){
    HalflingThief thief = new HalflingThief(new HitAndRunMethod());
    thief.steal();
    thief.changeMethod(new SubtleMethod());
    thief.steal();
  }

}
