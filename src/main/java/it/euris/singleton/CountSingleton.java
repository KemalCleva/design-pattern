package it.euris.singleton;

public class CountSingleton {

  private static int count = 0;

  private CountSingleton() {

  }

  public static CountSingleton newInstance() {
    if (count > 0) {
      throw new RuntimeException("counter greater than zero");
    }
    return new CountSingleton();
  }


}
