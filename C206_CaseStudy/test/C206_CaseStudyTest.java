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

	private BikeUser u1;
	private BikeUser u2;
	private Biker b1;
	private Biker b2;
	private BikeGroup g1;
	private BikeGroup g2;
	private Event e1;
	private Event e2;
	private Registration rg1;
	private Registration rg2;


	//ArrayList 
	private static ArrayList<Biker> testBikeList;
	private static ArrayList<BikeUser> testUserList;
	private static ArrayList<BikeGroup> testGroupList;
	private ArrayList<Event> EventList;
	private static ArrayList<Registration> registrationList;

	public C206_CaseStudyTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		// prepare test data

		u1 = new BikeUser("Sally", 22 ,"sally1234@gmail.com", 12345678);
		u2 = new BikeUser("Mark", 26, "mark1234@gmail.com", 87654321);
		b1 = new Biker("FX123", "Sport mode","FDC345F","Black",1230.00);
		b2 = new Biker("FX321", "Casual mode","FDE452E","Grey",4350.00);
		g1 = new BikeGroup(1, "sally");
		g2 = new BikeGroup(2, "mark");
		e1 = new Event("wheels", "biking group","2023-08-08","10:10");
		e2 = new Event("Sports together", "share your bikes", "2023-10-04","10:09");
		rg1 = new Registration("Jennie", "jenniekim@gmail.com", 98765432);
	    rg2 = new Registration("Lisa", "lisatan@gmail.com", 87654321);

		testUserList = new ArrayList<BikeUser>(); 
		testBikeList = new ArrayList<Biker>(); 
		testGroupList = new ArrayList<BikeGroup>();
		EventList= new ArrayList<Event>();
		registrationList = new ArrayList<Registration>();
	}

	@Test
	public void testAddUser() {
		// Item list is not null and it is empty
		assertNotNull("Test if there is valid user arraylist to add to", testUserList);
		
		//Given an empty list, after adding 1 item, the size of the list is 1
		testUserList.add(u1);
		assertEquals("Test that the user arraylist size is 1.", 1, testUserList.size());
		assertSame("Test that the user arraylist size is 1.", u1,testUserList.get(0));

		// Add an item
		testUserList.add(u2);
		assertEquals("Test that the user arraylist size is now 2.", 2, testUserList.size());
		//The item just added is as same as the last item in the list
		assertSame("Test that user is added to the end of the list.", u2, testUserList.get(1));
	}

	@Test
	public void testViewUser() {
		// Item list is not null and it is empty
		testUserList.add(u1);
		testUserList.add(u2);

		assertEquals("Test that the user arraylist size is now 2.", 2, testUserList.size());
		assertSame("Test that the user arraylist size is now 2.", 2, testUserList.size());

		assertFalse("Test that it does not return 1",false);
	}
	
	@Test
	public void testDeleteUser() {
		// Item list is not empty (2 items)
		testUserList.add(u1);
		testUserList.add(u2);

		assertEquals("Test that the user arraylist size is now 2.", 2, testUserList.size());
		//The item just added is as same as the last item in the list
		assertSame("Test that user is added to the end of the list.", u2, testUserList.get(1));
		//
		assertNotNull("Test if there is valid user arraylist to delete to", testUserList);
		//Given an empty list, after deleting 1 item, the size of the list is 1
		testUserList.remove(u1);
		assertEquals("Test that the user arraylist size is 1.", 1, testUserList.size());

	}

	@Test
	public void testAddBike() {
		// Item list is not null and it is empty //
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
		
		
		//Test delete existing
	    assertSame("Test deleting an existing event", b2, testBikeList.get(1));
	    assertEquals("Check that Event arraylist size is 2 after deletion", 2, testBikeList.size());
		assertNotNull("Test if there is valid bike arraylist to delete to", testBikeList);
		
		//Given an empty list, after deleting 1 item, the size of the list is 1
		testBikeList.remove(b1);
		assertEquals("Test that the bike arraylist size is 1.", 1, testBikeList.size());

	}
	
	@Test
	public void testAddGroup() {
		// Item list is not null and it is empty
		assertNotNull("Test if there is valid group arraylist to add to", testGroupList);
		
		//Given an empty list, after adding 1 item, the size of the list is 1
		testGroupList.add(g1);
		assertEquals("Test that the group arraylist size is 1.", 1, testGroupList.size());
		assertSame("Test that the group arraylist size is 1.", g1,testGroupList.get(0));

		// Add an item
		testGroupList.add(g2);
		assertEquals("Test that the group arraylist size is now 2.", 2, testGroupList.size());
		//The item just added is as same as the last item in the list
		assertSame("Test that group is added to the end of the list.", g2, testGroupList.get(1));
	}

	@Test
	public void testViewGroup() {
		// Item list is not null and it is empty
		testGroupList.add(g1);
		testGroupList.add(g2);

		assertEquals("Test that the group arraylist size is now 2.", 2, testGroupList.size());
		assertSame("Test that the group arraylist size is now 2.", 2, testGroupList.size());

		assertFalse("Test that it does not return 1",false);
	}
	
	@Test
	public void testDeleteGroup() {
		// Item list is not empty (2 items)
		testGroupList.add(g1);
		testGroupList.add(g2);

		assertEquals("Test that the group arraylist size is now 2.", 2, testGroupList.size());
		//The item just added is as same as the last item in the list
		assertSame("Test that group is added to the end of the list.", g2, testGroupList.get(1));
		//
		assertNotNull("Test if there is valid group arraylist to delete to", testGroupList);
		//Given an empty list, after deleting 1 item, the size of the list is 1
		testGroupList.remove(g1);
		assertEquals("Test that the group arraylist size is 1.", 1, testGroupList.size());

	}
	
	@Test
	public void testAddEvent() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Event arraylist to add to", EventList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		EventList.add(e1); 
		assertEquals("Check that Event arraylist size is 1", 1, EventList.size());
		assertSame("Check that Event is added", e1, EventList.get(0));

		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		EventList.add(e2); 
		assertEquals("Check that Event arraylist size is 2", 2, EventList.size());
		assertSame("Check that Event is added", e2, EventList.get(1));


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

	@Test
	  public void testAddRegistration() {
	    // Item list is not null and it is empty
	    assertNotNull("Test if there is valid registration arraylist to add to", registrationList);
	    //Given an empty list, after adding 1 item, the size of the list is 1
	    registrationList.add(rg1);
	    assertEquals("Test that the registration arraylist size is 1.", 1, registrationList.size());
	    assertSame("Test that the registration arraylist size is 1.", rg1,registrationList.get(0));

	    // Add an item
	    registrationList.add(rg2);
	    assertEquals("Test that the registration arraylist size is now 2.", 2, registrationList.size());
	    //The item just added is as same as the last item in the list
	    assertSame("Test that registration is added to the end of the list.", rg2, registrationList.get(1));
	    //
	  }
	  
	  @Test
	  public void testViewRegistration() {
	    // Item list is not null and it is empty
	    registrationList.add(rg1);
	    registrationList.add(rg2);

	    assertEquals("Test that the registration arraylist size is now 2.", 2, registrationList.size());
	    assertSame("Test that the registration arraylist size is now 2.", 2, registrationList.size());

	    //
	    assertFalse("Test that it does not return 1",false);

	  }
	  
	  @Test
	  public void testDeleteRegistration() {

	    // Adding events to the list
	    registrationList.add(rg1);
	    registrationList.add(rg2);

	    // Test deleting an existing event

	    assertSame("Test deleting an existing event", rg2, registrationList.get(1));
	    assertEquals("Check that registration arraylist size is 2 after deletion", 2, registrationList.size());

	    // Test deleting a non-existent event
	    assertNotNull("Test that the registration arrayList is not null",registrationList);
	    registrationList.remove(rg1);
	    assertEquals("Check that registration arraylist size remains 1 after unsuccessful deletion", 1, registrationList.size());
	  }

	@After
	public void tearDown() throws Exception {
		u1 = null;
		u2 = null;
		b1 = null;
		b2 = null;
		g1 = null;
		g2 = null;
		e1 = null;
		e2 = null;
		rg1 = null;
		rg2 = null;
		
		testUserList = null;
		testBikeList = null;
		testGroupList = null;
		EventList = null;
		registrationList = null;


	}

}
