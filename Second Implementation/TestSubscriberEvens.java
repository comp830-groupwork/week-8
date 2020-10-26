package week8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSubscriberEvens {

	// Testing the threshold value
	@Test
	void test1() {
		PublisherImpl pub = new PublisherImpl();
		SubscriberEven even = new SubscriberEven(3);
		pub.runSimulation( );
		int threshold = even.getEventsHandled();
		assertEquals(true, threshold <= 3);
		
	}
	
	// Testing all subscribers are notified
	@Test
	void test2()
	{
		PublisherImpl pub = new PublisherImpl();
		boolean b = pub.runSimulation();
		assertEquals(true,b);
		
	}
	
	
	

}
