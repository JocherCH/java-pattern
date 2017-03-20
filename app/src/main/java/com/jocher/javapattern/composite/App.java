package com.jocher.javapattern.composite;

/**
 * Created by wubin on 2017/3/20.
 */

public class App {

  public static void main(String[] args){
    Dir diskC = new Folder("C ");
    diskC.addDir(new File("sqlserver.sql"));
    Dir dirWin = new Folder("Windows");
    dirWin.addDir(new File("explorer.exe"));
    diskC.addDir(dirWin);

    Dir dirPer = new Folder("PerfLogs");
    dirPer.addDir(new File("null.txt"));
    diskC.addDir(dirPer);

    diskC.print();
  }

}
