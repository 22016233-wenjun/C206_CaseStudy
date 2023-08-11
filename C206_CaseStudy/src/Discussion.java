import java.time.LocalDate;
import java.util.ArrayList;

public class Discussion {
    private int id;
    private String title;
    private String postedBy;
    private LocalDate date;
    private ArrayList<String> comments;

    // Constructor //
    public Discussion(int id, String title, String postedBy, LocalDate date) {
        this.id = id;
        this.title = title;
        this.postedBy = postedBy;
        this.date = date;
        this.comments = new ArrayList<>(); // Initializing comments ArrayList
    }

    // Getters and Setters //
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(String postedBy) {
        this.postedBy = postedBy;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public ArrayList<String> getComments() {
        return comments;
    }

    public void addComment(String comment) {
        this.comments.add(comment);
    }

    public void removeComment(int index) {
        if (index >= 0 && index < this.comments.size()) {
            this.comments.remove(index);
        }
    }

    public void listComments() {
        for (String comment : comments) {
            System.out.println(comment);
        }
    }
}
