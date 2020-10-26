package week8;

public class SubscriberEven implements Subscriber {
	
	private int eventsHandled=0;
	private int turnOffThreshold;
	
	
	public int getEventsHandled() {
		return eventsHandled;
	}

	public void setEventsHandled(int eventsHandled ) {
		this.eventsHandled = eventsHandled;
	}

	public SubscriberEven(int threshold)
	{
		this.turnOffThreshold = threshold;
	}

	@Override
	public boolean notifySubscriber(Event e) {
		
		
		// TODO Auto-generated method stub
		System.out.println("SubscriberEvens was called");
		if (e.getEventDataValue()%2 ==0)
			{
			eventsHandled++;
			
			if ( eventsHandled<=turnOffThreshold) 
			{
				System.out.println("SubscriberEvens: Event is even:");
				System.out.println("Events Handled for SubscriberEvens "+ eventsHandled);
				System.out.println("Threshold for SubscriberEvens"+ turnOffThreshold);
				
				return true;
			}
			else
			{
				System.out.println("Threshold reached");
				if(eventsHandled%40==0)
				{
					System.out.println("Events Handled reset to 0");
					eventsHandled=0;
					return false;
				}
			}
			}
			
		return false;	

}
}