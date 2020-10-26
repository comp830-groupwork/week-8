package week8;

public class SubscriberOdds implements Subscriber {
	
	private int eventshandled = 0;
	private int turnoffThreshold;
	
	SubscriberOdds(int threshold)
	{
	this.turnoffThreshold = threshold;
	}

	public int getEventshandled() {
		return eventshandled;
	}

	public void setEventshandled(int eventshandled) {
		this.eventshandled = eventshandled;
	}

	@Override
	public boolean notifySubscriber(Event e) {
		
		System.out.println("SubscriberOdds was called");
		if (e.getEventDataValue() %2 !=0 )
		{
			eventshandled++;
			if (getEventshandled()<=turnoffThreshold)
			{
				System.out.println("SubscriberOdds, Event is odd");
				System.out.println("Events Handled for SubscriberOdds "+ getEventshandled());
				System.out.println("Threshold for SubscriberOddEvens"+ turnoffThreshold);
				
				return true;
			}
			else
			{
				System.out.println("Threshold reached");
				if(eventshandled%40 == 0)
					{
					System.out.println("Resetting events counter to zero");
					eventshandled=0;
					if (eventshandled == 0)
						return false;
					}
			}
		}
		return false;
			
	}

}
