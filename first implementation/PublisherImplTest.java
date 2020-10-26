package hw8;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class PublisherImplTest {

	@Test
	void test() {
		
		ArrayList<Subscriber> subs = new ArrayList<>(1);
		
		ArrayList<Subscriber> sub1 = new ArrayList<>(1);
		
		PublisherImpl pub = new PublisherImpl();
		
		SubscriberOdds s1 = new SubscriberOdds(21);
		
		subs = pub.registerSubscriber(s1);
		
		sub1.add(s1);
		
		assertEquals(sub1, subs);
	}
	
	
	@Test
	void test2() {
		
		ArrayList<Subscriber> subs = new ArrayList<>();
		
		ArrayList<Subscriber> sub1 = new ArrayList<>();
		
		PublisherImpl pub = new PublisherImpl();
		
		SubscriberOdds s1 = new SubscriberOdds(21);
		
		subs = pub.registerSubscriber(s1);
		
		subs = pub.unregisterSubscriber(s1);
				
		assertEquals(sub1, subs);
		
	}
	
	@Test
	void test3() {
		
		PublisherImpl pub = new PublisherImpl();
		
		pub.runSimulation();
		
		if(pub.runSimulation()==true) {
			
			assertEquals(true, pub.runSimulation());
		}
	}

}

