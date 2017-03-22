package com.jocher.javapattern.state;

/**
 * Created by wubin on 2017/3/22.
 */

public class App {

  public static void main(String[] args) {

    Mammoth mammoth = new Mammoth();
    mammoth.observe();
    mammoth.timePasses();
    mammoth.observe();
    mammoth.timePasses();
    mammoth.observe();

  }

}
