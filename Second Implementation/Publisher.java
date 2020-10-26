package week8;

public interface Publisher {

public boolean registerSubscriber(Subscriber s);
public boolean unregisterSubscriber(Subscriber s);
public boolean notifySubscriber(Event e);

}
