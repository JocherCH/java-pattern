package com.jocher.javapattern.composite;

import java.util.Iterator;
import java.util.List;

/**
 * Created by wubin on 2017/3/20.
 */

public class Folder extends Dir {

  public Folder(String name) {
    super(name);
  }


  @Override
  public void addDir(Dir dir) {
    dirs.add(dir);
  }

  @Override
  public void removeDir(Dir dir) {
    dirs.remove(dir);
  }

  @Override
  public void clean() {
    dirs.clear();
  }

  @Override
  public void print() {
    System.out.println(getName()+" { ");
    Iterator<Dir> iterator = dirs.iterator();
    while (iterator.hasNext()){
      Dir dir = iterator.next();
      dir.print();
      if(iterator.hasNext()){
        System.out.println(" , ");
      }
    }
    System.out.println("} ");
  }

  @Override
  public List<Dir> getDir() {
    return dirs;
  }
}
