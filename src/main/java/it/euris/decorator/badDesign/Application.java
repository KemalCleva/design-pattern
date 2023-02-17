package it.euris.decorator.badDesign;

import it.euris.decorator.badDesign.Notifier;
import it.euris.decorator.badDesign.NotifierEnum;
import it.euris.decorator.badDesign.NotifierFactory;
import java.util.ArrayList;
import java.util.List;

public class Application {

  private final NotifierFactory notifierFactory;
  private final List<Notifier> notifiers;

  public Application(NotifierFactory notifierFactory) {
    this.notifierFactory = notifierFactory;
    this.notifiers = new ArrayList<>();
  }

  public void setNotifiers(NotifierEnum notifierEnum) {
    this.notifiers.add(notifierFactory.build(notifierEnum));
  }

  public void doSomething(String message) {
    this.notifiers.forEach(notifier -> notifier.send(message));
  }


}
