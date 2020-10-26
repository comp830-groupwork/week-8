package hw8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubscriberEvenTest {

	@Test
	void test() {
		
		SubscriberEven se = new SubscriberEven(14);
		
		Event e = new Event();
		
		boolean value = se.notifySubscriber(null);
			
		assertEquals(false, value);
			
		se.notifySubscriber(e);		
			
		assertEquals(true, se.notifySubscriber(e));
			
		}
		
	}


