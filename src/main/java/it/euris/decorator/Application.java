package it.euris.decorator;

public class Application {

  private Notifier notifier;

  public void setNotifier(Notifier notifier) {
    this.notifier = notifier;
  }

  public void notify(String message) {
    this.notifier.send(message);
  }

}
