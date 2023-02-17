package it.euris.decorator.badDesign;

public class SlackNotifier extends Notifier {

  @Override
  public void send(String message) {
    System.out.printf("Message sent from SlackNotifier: %s\n", message);
  }

}
