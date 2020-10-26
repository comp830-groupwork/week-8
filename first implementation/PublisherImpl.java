package hw8;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class PublisherImpl implements Publisher {
	
	ArrayList<Subscriber> subs = new ArrayList<>();
	
	private int edv;	
	private int seqNum = 0;	
	Event e = new Event();
	
	
	public PublisherImpl() {
		
		}
	
	@Override
	public ArrayList<Subscriber> registerSubscriber(Subscriber s) {
		subs.add(s);
		return subs;		
	}
	
	
	public ArrayList<Subscriber> unregisterSubscriber(Subscriber s){
		
		subs.remove(s);
		return subs;	
	}
	
	
	public boolean notifySubscribers(Event e) {
		
		for (Subscriber sub: subs) {
			
			sub.notifySubscriber(e);
				
			}
		return true;
		}	
		
	
	
	public boolean runSimulation() {
		
		for (int i = 0; i < 200; i++) {
			
			edv = ThreadLocalRandom.current().nextInt(0, 200);			
			
			seqNum = i;		
			
		    e.setEventSeqNum(seqNum);
		    
		    e.setEventDataValue(edv);
		    
		    notifySubscribers(e);
		    
		    System.out.println("\n");
		    
		    System.out.println("data value is: " + " " + e.getEventDataValue());	    
		    
		    System.out.println("seq num is: " + " " + e.getEventSeqNum());	
		    
		    System.out.println("\n");
		    
	}
		return true;	

	}
}
