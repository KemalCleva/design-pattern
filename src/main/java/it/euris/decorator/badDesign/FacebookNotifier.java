package it.euris.decorator.badDesign;

public class FacebookNotifier extends Notifier {

  @Override
  public void send(String message) {
    System.out.printf("Message sent from FacebookNotifier: %s\n", message);
  }

}
