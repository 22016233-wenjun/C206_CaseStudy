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
	private Biker b1;
	private Biker b2;


	//ArrayList
	private static ArrayList<Biker> testBikeList;
	private ArrayList<Event> EventList;


	public C206_CaseStudyTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		// prepare test data

		e1 = new Event("wheels", "biking group","2023-08-08","10:10");
		e2 = new Event("Sports together", "share your bikes", "2023-10-04","10:09");
		b1 = new Biker("FX123", "Sport mode","FDC345F","Black",1230.00);
		b1 = new Biker("FX321", "Casual mode","FDE452E","Grey",4350.00);

		EventList= new ArrayList<Event>();
		testBikeList = new ArrayList<Biker>(); 
	}

	@Test
	public void testAddBike() {
		// Item list is not null and it is empty
		assertNotNull("Test if there is valid bike arraylist to add to", testBikeList);
		//Given an empty list, after adding 1 item, the size of the list is 1
		testBikeList.add(b1);
		assertEquals("Test that the bike arraylist size is 1.", 1, testBikeList.size());
		assertSame("Test that the bike arraylist size is 1.", b1,testBikeList.get(0));

		// Add an item
		testBikeList.add(b2);
		assertEquals("Test that the bike arraylist size is now 2.", 2, testBikeList.size());
		//The item just added is as same as the last item in the list
		assertSame("Test that bike is added to the end of the list.", b2, testBikeList.get(1));
		//
	}

	@Test
	public void testViewBike() {
		// Item list is not null and it is empty
		testBikeList.add(b1);
		testBikeList.add(b2);

		assertEquals("Test that the bike arraylist size is now 2.", 2, testBikeList.size());
		assertSame("Test that the bike arraylist size is now 2.", 2, testBikeList.size());

		//
		assertFalse("Test that it does not return 1",false);

	}
	@Test
	public void testDeleteBike() {
		// Item list is not empty (2 items)
		testBikeList.add(b1);
		testBikeList.add(b2);

		assertEquals("Test that the bike arraylist size is now 2.", 2, testBikeList.size());
		//The item just added is as same as the last item in the list
		assertSame("Test that bike is added to the end of the list.", b2, testBikeList.get(1));
		//
		assertNotNull("Test if there is valid bike arraylist to delete to", testBikeList);
		//Given an empty list, after deleting 1 item, the size of the list is 1
		testBikeList.remove(b1);
		assertEquals("Test that the bike arraylist size is 1.", 1, testBikeList.size());

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
		b1 = null;
		b2 = null;

		EventList = null;
		testBikeList = null;


	}

}
