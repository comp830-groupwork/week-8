package week8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class PublisherImpl implements Publisher {
	
	private List<Subscriber> Subscribers = new ArrayList<Subscriber>();
	
	PublisherImpl()
	{
		
	}

	@Override
	public boolean registerSubscriber(Subscriber s) {
		// TODO Auto-generated method stub
		boolean b = Subscribers.add(s);
		System.out.println("adding subscriber");
		return b;

	}

	@Override
	public boolean unregisterSubscriber(Subscriber s) {
		// TODO Auto-generated method stub
		boolean b = Subscribers.remove(s);
		System.out.println("Removing Subscriber");
		return b;

	}

	@Override
	public boolean notifySubscriber(Event e) {
		// TODO Auto-generated method stub
		Iterator<Subscriber> iterator = Subscribers.iterator();
		while(iterator.hasNext() )
		{
			boolean b =iterator.next().notifySubscriber(e);
		
		}
		
		return true;
		
	}

	private Event generateEvent()
	{
		Event event = new Event();
		return event;
	}
	
		
	public boolean runSimulation()
	{
		int i, nextrandom;
		boolean b = false ;
				
		for (i=0;i<200;i++)
		{
			Random r= new Random();
			nextrandom = r.nextInt(500);
			Event event = generateEvent();			
			event.EventDataValue=nextrandom;
			event.EventSequenceNum = i;
			System.out.println(event.getEventDataValue() +" "+ event.getEventSeqNum());
			b = notifySubscriber(event);
		}
		
		return b;
	}
	
	
}
