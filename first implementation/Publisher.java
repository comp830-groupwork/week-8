package hw8;

import java.util.ArrayList;

public interface Publisher {
	
	public ArrayList<Subscriber> registerSubscriber(Subscriber s);
	
	public ArrayList<Subscriber> unregisterSubscriber(Subscriber s);
	
	public boolean notifySubscribers(Event e);
	

}
