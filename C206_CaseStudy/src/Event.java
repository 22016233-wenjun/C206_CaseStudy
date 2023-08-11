
public class Event {
    private String Name;
    private String description;
    private String Date;
    private String time;

    public Event(String Name, String description, String Date, String time) {
        this.Name = Name;
        this.description = description;
        this.Date = Date;
        this.time = time;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
    public String gettime() {
    	return time;
    }
    public void settime(String time) {
    	this.time = time;
    }


}


