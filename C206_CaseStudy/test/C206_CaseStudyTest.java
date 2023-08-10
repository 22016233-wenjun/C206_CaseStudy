import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
//
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class C206_CaseStudyTest {

	private static ArrayList<BikeUser> testUserList;
    private static ArrayList<Biker> testBikeList;
    private static ArrayList<BikeGroup> testGroupList;
    private static ArrayList<Discussion> testDiscussionList;
    private static ArrayList<Event> testEventList;
    private static ArrayList<Registration> testRegistrationList;


    @Before
    public void setUp() throws Exception {
    	testUserList = new ArrayList<>();
        testBikeList = new ArrayList<>();
        testGroupList = new ArrayList<>();
        testDiscussionList = new ArrayList<>();
        testEventList = new ArrayList<>();
        testRegistrationList = new ArrayList<>();
    }
    
    @Test
    public void testAddUser() {
        BikeUser user = new BikeUser("John Doe", 25, "john@example.com", 12345678);
        C206_CaseStudy.addUser(testUserList, user);
        assertEquals(1, testUserList.size()); 
        assertEquals("username1", testUserList.get(0).getName());
    }

   
   

    @Test
    public void testAddRegistration() {
        Registration registration = new Registration("John Doe", "john@example.com", "12345678");
        C206_CaseStudy.addRegistration(testRegistrationList, registration);
        assertEquals(1, testRegistrationList.size()); 
        assertEquals("John Doe", testRegistrationList.get(0).getName());
    }


    @Test
    public void testAddBike() {
        // given
        Biker biker = new Biker("model1", "desc1", "license1", "red", 1000);
        testBikeList.add(biker);
        
        // then
        assertEquals(1, testBikeList.size());
        assertEquals("model1", testBikeList.get(0).getModel());
    }

    @Test
    public void testDeleteBike() {
        // given
        Biker biker = new Biker("model1", "desc1", "license1", "red", 1000);
        testBikeList.add(biker);
        
        // when
        testBikeList.remove(0);

        // then
        assertTrue(testBikeList.isEmpty());
    }

    @Test
    public void testAddGroup() {
        BikeGroup group = new BikeGroup(1234, "groupDesc1");
        C206_CaseStudy.addGroup(testGroupList, group);
        assertEquals(1, testGroupList.size()); 
        assertEquals("groupName1", testGroupList.get(0).getName());
    }
    @Test
    public void testAddDiscussion() {
        // given
        Discussion discussion = new Discussion(1, "test", "poster1", LocalDate.now());
        testDiscussionList.add(discussion);

        // then
        assertFalse(testDiscussionList.isEmpty());
    }

    @Test
    public void testAddEvent() {
        // given
        Event event = new Event("event1", "desc1", LocalDate.now().toString(), LocalTime.now().toString());
        testEventList.add(event);

        // then
        assertEquals("event1", testEventList.get(0).getName());
    }

   
}
