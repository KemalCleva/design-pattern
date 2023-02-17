package it.euris;

import it.euris.decorator.Application;
import it.euris.decorator.Notifier;
import it.euris.decorator.SlackNotifierDecorator;

public class Main {

  public static void main(String[] args) {

    Notifier notifier = new Notifier();
    SlackNotifierDecorator slackNotifier = new SlackNotifierDecorator(notifier);
    Application application = new Application();
    application.setNotifier(slackNotifier);
    application.notify("ALERT!");

  }
}