package org.example.modernjava;

import java.util.List;

public class VarExample {
  public void doSomething(List<String> in) {
      for(var s : in) {
          System.out.println(s);
      }
  }
}
