/**
 * 
 */

/**
 * @author wenju
 *
 */
import java.util.ArrayList;

public class Biker {
    private String id;
    private String name;
    private ArrayList<BikeGroup> groups;
    private ArrayList<Event> events;

    public Biker(String id, String name) {
        this.id = id;
        this.name = name;
        this.groups = new ArrayList<>();
        this.events = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<BikeGroup> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<BikeGroup> groups) {
        this.groups = groups;
    }

    public ArrayList<Event> getEvents() {
        this.events = events;
    }

    public void addGroup(BikeGroup group) {
        this.groups.add(group);
    }

    public void removeGroup(BikeGroup group) {
        this.groups.remove(group);
    }

    public void addEvent(Event event) {
        this.events.add(event);
    }

    public void removeEvent(Event event) {
        this.events.remove(event);
    }
}

