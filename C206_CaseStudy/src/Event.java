
import java.util.ArrayList;

public class Event {
    private String id;
    private String name;
    private ArrayList<Biker> participants;

    public Event(String id, String name) {
        this.id = id;
        this.name = name;
        this.participants = new ArrayList<>();
    }

    // Getter and setter methods

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

    public ArrayList<Biker> getParticipants() {
        return participants;
    }

    public void addParticipant(Biker biker) {
        this.participants.add(biker);
    }

    public void removeParticipant(Biker biker) {
        this.participants.remove(biker);
    }
}
