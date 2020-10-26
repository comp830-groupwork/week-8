package week8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPublisherImpl {

	@Test
	void test1() {
		PublisherImpl pub = new PublisherImpl();
		SubscriberOdds subsodd =  new SubscriberOdds(21);
		Boolean b = pub.registerSubscriber(subsodd);
		assertEquals(true, b);
	}
	@Test
	void test2()
	{
		PublisherImpl pub = new PublisherImpl();
		SubscriberOdds subsodd =  new SubscriberOdds(21);
		pub.registerSubscriber(subsodd);
		Boolean b = pub.unregisterSubscriber(subsodd);
		assertEquals(true, b);
	}
	
	@Test
	void test3()
	{
		PublisherImpl pub = new PublisherImpl();
		Event event = new Event();	
		Boolean b = pub.notifySubscriber(event);
		System.out.println("Testing notify subscribers"+ b);
		assertEquals(true, b);
		
	}
	

}
