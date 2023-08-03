import java.util.ArrayList;

public class Helper {
    private static ArrayList<Biker> bikerList = new ArrayList<>();
    private static ArrayList<BikeGroup> groupList = new ArrayList<>();
    private static ArrayList<Event> eventList = new ArrayList<>();

    // Getters for the lists
    public static ArrayList<Biker> getBikerList() {
        return bikerList;
    }

    public static ArrayList<BikeGroup> getGroupList() {
        return groupList;
    }

    public static ArrayList<Event> getEventList() {
        return eventList;
    }

    // Add methods
    public static void addBiker(Biker biker) {
        bikerList.add(biker);
    }

    public static void addGroup(BikeGroup group) {
        groupList.add(group);
    }

    public static void addEvent(Event event) {
        eventList.add(event);
    }

    // Delete methods
    public static boolean deleteBiker(String bikerName) {
        return bikerList.removeIf(biker -> biker.getName().equals(bikerName));
    }

    public static boolean deleteGroup(String groupName) {
        return groupList.removeIf(group -> group.getName().equals(groupName));
    }

    public static boolean deleteEvent(String eventName) {
        return eventList.removeIf(event -> event.getName().equals(eventName));
    }
}
