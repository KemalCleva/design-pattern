package it.euris.decorator;

public class SlackNotifierDecorator extends NotifierDecorator {

  public SlackNotifierDecorator(Notifier notifier) {
    super(notifier);
  }

  @Override
  public void extra(String message) {
    System.out.printf("Message sent from SlackNotifier: %s\n", message);
  }
}
