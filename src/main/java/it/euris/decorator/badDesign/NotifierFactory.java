package it.euris.decorator.badDesign;

public class NotifierFactory {

  private static NotifierFactory instance;

  private NotifierFactory() { }

  public static NotifierFactory getInstance() {
    if (instance == null) {
      instance = new NotifierFactory();
    }
    return instance;
  }

  public Notifier build(NotifierEnum notifierEnum) {
    switch (notifierEnum) {
      case SMS: return new SmsNotifier();
      case FACEBOOK: return new FacebookNotifier();
      case SLACK: return new SlackNotifier();
      default: return new Notifier();
    }
  }
}
