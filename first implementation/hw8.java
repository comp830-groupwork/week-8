package hw8;

public class hw8 {

	public static void main(String[] args) {
		
		SubscriberEven se = new SubscriberEven(14);	
		SubscriberOdds so = new SubscriberOdds(21);
		SubscriberThrees st = new SubscriberThrees(10);
			
		PublisherImpl pub = new PublisherImpl();
		
		Event e = new Event();
				
		pub.registerSubscriber(se);
		pub.registerSubscriber(so);
		pub.registerSubscriber(st);
		
		System.out.println(pub.runSimulation());
		
		System.out.println("\n");
		
		System.out.println(se.notifySubscriber(e));	
		
		System.out.println((se.setEventsHandled()));
			
		System.out.println(se.getEventsHandled());
		
		System.out.println("\n");
		
		System.out.println(so.setEventsHandled(so.notifySubscriber(e)));
		
		System.out.println(so.getEventsHandled());
		
		System.out.println("\n");
		
		System.out.println(st.setEventsHandled(st.notifySubscriber(e)));
		
		System.out.println(st.getEventsHandled());
	}

}

	

