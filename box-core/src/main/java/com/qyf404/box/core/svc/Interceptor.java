package com.qyf404.box.core.svc;



/**
 * @author Tom Baeyens
 */
public abstract class Interceptor implements CommandService {

  protected CommandService next;

  public CommandService getNext() {
    return next;
  }
  public void setNext(CommandService next) {
    this.next = next;
  }
}
