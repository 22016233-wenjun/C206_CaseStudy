/**
 * 
 */

/**
 * @author wenju
 *
 */
import java.util.ArrayList;

public class BikeGroup {
    private String id;
    private String name;
    private ArrayList<Biker> members;

    public BikeGroup(String id, String name) {
        this.id = id;
        this.name = name;
        this.members = new ArrayList<>();
    }

    // Getter and setter methods

    public BikeGroup(String groupName, Object name2) {
		// TODO Auto-generated constructor stub
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

    public ArrayList<Biker> getMembers() {
        return members;
    }

    public void addMember(Biker biker) {
        this.members.add(biker);
    }

    public void removeMember(Biker biker) {
        this.members.remove(biker);
    }
}

