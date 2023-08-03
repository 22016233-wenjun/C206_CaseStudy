import java.util.ArrayList;
import java.util.Scanner;

public class C206_CaseStudy {
    private static final int OPTION_QUIT = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;

        while (option != OPTION_QUIT) {
            C206_CaseStudy.menu();
            option = sc.nextInt();

            switch (option) {
                case 1:
                    // Add Biker
                    System.out.println("Enter Biker Name: ");
                    String bikerName = sc.next();
                    System.out.println("Enter Biker Email: ");
                    String bikerEmail = sc.next();
                    Helper.addBiker(new Biker(bikerName, bikerEmail));
                    break;

                case 2:
                    // Add Bike Group
                    System.out.println("Enter Bike Group Name: ");
                    String groupName = sc.next();
                    Helper.addGroup(new BikeGroup(groupName, new ArrayList<>()));
                    break;

                case 3:
                    // Add Event
                    System.out.println("Enter Event Name: ");
                    String eventName = sc.next();
                    System.out.println("Enter Event Date: ");
                    String eventDate = sc.next();
                    Helper.addEvent(new Event(eventName, eventDate));
                    break;

                case 4:
                    // View Lists
                    System.out.println("Bikers: " + Helper.getBikerList());
                    System.out.println("Bike Groups: " + Helper.getGroupList());
                    System.out.println("Events: " + Helper.getEventList());
                    break;

                case 5:
                    // Delete Biker
                    System.out.println("Enter Biker Name to Delete: ");
                    String deleteBikerName = sc.next();
                    Helper.deleteBiker(deleteBikerName);
                    break;

                case 6:
                    // Delete Bike Group
                    System.out.println("Enter Bike Group Name to Delete: ");
                    String deleteGroupName = sc.next();
                    Helper.deleteGroup(deleteGroupName);
                    break;

                case 7:
                    // Delete Event
                    System.out.println("Enter Event Name to Delete: ");
                    String deleteEventName = sc.next();
                    Helper.deleteEvent(deleteEventName);
                    break;

                case 8: OPTION_QUIT:
                    System.out.println("Bye!");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("1: Add Biker");
        System.out.println("2: Add Bike Group");
        System.out.println("3: Add Event");
        System.out.println("4: View Lists");
        System.out.println("5: Delete Biker");
        System.out.println("6: Delete Bike Group");
        System.out.println("7: Delete Event");
        System.out.println("8: Quit");
        System.out.println("Enter an option:");
    }
}
