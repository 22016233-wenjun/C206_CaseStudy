//
public class Registration {
  private String name;
    private String email;
    private int contactNumber;

    public Registration(String name, String email, int contactNumber) {
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    // Getters //
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    // Setters ////
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }
}