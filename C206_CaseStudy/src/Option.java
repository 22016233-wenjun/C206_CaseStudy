
public enum Option {
    QUIT("Q", "Quit the program"),
    VIEW_BIKERS("1", "View all bikers"),
    ADD_BIKER("2", "Add a new biker"),
    DELETE_BIKER("3", "Delete a biker"),
    VIEW_GROUPS("4", "View all bike groups"),
    ADD_GROUP("5", "Add a new bike group"),
    DELETE_GROUP("6", "Delete a bike group"),
    VIEW_EVENTS("7", "View all events"),
    ADD_EVENT("8", "Add a new event"),
    DELETE_EVENT("9", "Delete an event");

    private String code;
    private String description;

    Option(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static Option fromCode(String code) {
        for (Option option : Option.values()) {
            if (option.getCode().equals(code)) {
                return option;
            }
        }
        return null;
    }
}

