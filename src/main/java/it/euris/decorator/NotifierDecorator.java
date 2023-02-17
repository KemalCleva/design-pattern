package it.euris.decorator;

public abstract class NotifierDecorator extends Notifier {

  private final Notifier notifier;

  public NotifierDecorator(Notifier notifier) {
    this.notifier = notifier;
  }

  @Override
  public void send(String message) {
    notifier.send(message);
    extra(message);
  }

  public abstract void extra(String message);

}
