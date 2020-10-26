package hw8;

import java.util.ArrayList;

public class SubscriberEven implements Subscriber {
	
	private int turnOffThreshold = 14;
	ArrayList<Event> events = new ArrayList<>();
	ArrayList<Integer> evdat = new ArrayList<>();
	Event e = new Event();	
	
		
	
	public SubscriberEven(int turnOffThreshold) {	
		
		this.turnOffThreshold = turnOffThreshold;
		
	}	
	
	public boolean notifySubscriber(Event e) {	
		
		this.e = e;	
		
		if(e!=null) {
			
			System.out.println("SubscriberEven is notified" );
			
		}
		
		if(e==null) {
			
			System.out.println("There is no event and SubscriberEven is not notified" );
			
			return false;
			
		}
		
		if(e.getEventDataValue()%2==0) {	
			
			events.add(e);
			
			evdat.add(e.getEventDataValue());							
				}			
		return true;
	}
		
	
	public int setEventsHandled() {	
		
		System.out.println("Events Handled are:" + " " + events.size());
		
		return events.size();
		
	}
	

	public boolean getEventsHandled() {
		
		int count = evdat.size();
		
		if (evdat.size() <= turnOffThreshold) {
			
			for(int i = 0; i < evdat.size(); i++) {
				
				System.out.println("Event is even:" + " " + evdat.get(i));			
			}
			
			return true;
				
			}
		
			
		
		if (evdat.size() >= turnOffThreshold && evdat.size()% 40 == 0) {
			
			System.out.println("Threshold is 14");
			
			count = 0;
			
			System.out.println("Events Handled is reset to:" + " " + count);
				
			return false;							
		}		
		
		
		if (evdat.size() >= turnOffThreshold && evdat.size()%40 != 0) {
			
			System.out.println("Threshold is 14");
			
			count = evdat.size();
			
			System.out.println("Events Handled is not reset and it is same as evdat size:" + " " + count);
			
			return false;
										
		}
		return true;	
		
	}
}
	


