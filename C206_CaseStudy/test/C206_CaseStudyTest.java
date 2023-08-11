import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class C206_CaseStudyTest {

	private Event e1;
	private Event e2;
	
	
	private ArrayList<Event> EventList;
	
	
	public C206_CaseStudyTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception {
		// prepare test data
		
		e1 = new Event("wheels", "biking group","2023-08-08","10:10");
	    e2 = new Event("Sports together", "share your bikes", "2023-10-04","10:09");
		

		EventList= new ArrayList<Event>();
		
	}

	             
	@Test
	public void testAddEvent() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Event arraylist to add to", EventList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		EventList.add(e1); 
		assertEquals("Check that Event arraylist size is 1", 1, EventList.size());
		assertSame("Check that EVent is added", e1, EventList.get(0));
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		EventList.add(e2); 
		assertEquals("Check that Event arraylist size is 2", 2, EventList.size());
		assertSame("Check that Camcorder is added", e2, EventList.get(1));
		
		
	}

	
	@Test
	public void testDisplayEventList() {
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		EventList.add(e1);
	    EventList.add(e2);
		assertEquals("Test that Event arraylist size is 2", 2, EventList.size());
		assertSame("Test that Event arraylist size is 2", 2, EventList.size());
	
	}

	@Test
	public void testDeleteEventList() {
	
	    // Adding events to the list
	    EventList.add(e1);
	    EventList.add(e2);
	    
		// Test deleting an existing event
	  
	    assertSame("Test deleting an existing event", e2, EventList.get(1));
	    assertEquals("Check that Event arraylist size is 2 after deletion", 2, EventList.size());

	    // Test deleting a non-existent event
	   assertNotNull("Test that the event arrayList is not null",EventList);
	   EventList.remove(e1);
	    assertEquals("Check that Event arraylist size remains 1 after unsuccessful deletion", 1, EventList.size());
	}


  
	@After
	public void tearDown() throws Exception {
		e1 = null;
		e2 = null;
		
		EventList = null;
	

	}

}
