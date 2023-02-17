package it.euris.decorator.badDesign;

public class SmsNotifier extends Notifier {

  @Override
  public void send(String message) {
    System.out.printf("Message sent from SmsNotifier: %s\n", message);
  }

}
