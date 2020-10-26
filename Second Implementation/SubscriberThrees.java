package week8;

public class SubscriberThrees implements Subscriber {
	
	private int eventshandled = 0;
	private int turnoffThreshold;
	
	
	SubscriberThrees(int threshold)
	{
	this.turnoffThreshold = threshold;
	}

	private int getEventshandled() {
		return eventshandled;
	}

	private void setEventshandled(int eventshandled) {
		this.eventshandled = eventshandled;
	}

	@Override
	public boolean notifySubscriber(Event e) {
		// TODO Auto-generated method stub
		
		System.out.println("SubscriberThrees was called");
		if(e.getEventDataValue()%3==0)
		{
			eventshandled++;
			if (eventshandled<=turnoffThreshold)
			{
				System.out.println("SubscriberThrees: Event is divisible by 3:");
				System.out.println("Events Handled for SubscriberThrees "+ getEventshandled());
				System.out.println("Threshold for SubscriberThrees"+ turnoffThreshold);
				return true;
			}
			
			else {
				System.out.println("Threshold reached");
				if(eventshandled%40 ==0) 
				{
					System.out.println("Events Handled reset to 0");
					eventshandled = 0;
					return false;
				}
			}
		}
		
		return false;
	}

}
