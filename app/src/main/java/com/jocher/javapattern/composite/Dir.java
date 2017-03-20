package com.jocher.javapattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wubin on 2017/3/20.
 */

public abstract class Dir {
  protected List<Dir> dirs = new ArrayList<>();

  private String name;

  public Dir(String name){
    this.name = name;

  }

  public abstract void addDir(Dir dir);

  public abstract void removeDir(Dir dir);

  public abstract void clean();

  public abstract void print();

  public abstract List<Dir> getDir();

  public String getName(){
    return name;
  }


}
