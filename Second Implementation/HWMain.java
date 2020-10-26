package week8;

public class HWMain {
	
	public static void main(String args[])
	{
		PublisherImpl pub = new PublisherImpl();
		SubscriberOdds subsodd =  new SubscriberOdds(21);
		SubscriberEven subseven = new SubscriberEven(14);
		SubscriberThrees substhrees = new SubscriberThrees(10);
		
		pub.registerSubscriber(subsodd);
		pub.registerSubscriber(subseven);
		pub.registerSubscriber(substhrees);
		pub.runSimulation();
		
		
	}

}
