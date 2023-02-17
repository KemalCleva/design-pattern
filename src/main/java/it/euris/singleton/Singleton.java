package it.euris.singleton;

import java.time.LocalDate;

public class Singleton {

  private static Singleton instance;

  private Singleton() {

  }

  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }

  public void logINFO(String log) {
    System.out.printf("INFO - [%s] - %s\n", LocalDate.now(), log);
  }

}
