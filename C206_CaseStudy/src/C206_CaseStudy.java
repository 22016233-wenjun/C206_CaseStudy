import java.util.ArrayList;
import java.util.Scanner;

public class C206_CaseStudy {
	private static final int option_user = 1;
	private static final int option_bike = 2;
	private static final int option_group = 3;
	private static final int option_discussion = 4;
	private static final int option_event = 5;
	private static final int option_reqistration = 6;
	private static final int option_quit = 7;
	

	
	public static void main(String[] args) {

		ArrayList<Biker> bikeList = new ArrayList<Biker>();

		int option = 0;

		while (option != option_quit) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");
			
			
		if (option == option_user) {
			//Add a new bike
			System.out.println("USER");			
			System.out.println("1.Add a new user");
			System.out.println("2.View all users");
			System.out.println("3.Delete an existing user");
			
			int itemType = Helper.readInt("Enter option to select item type > ");

			if (itemType == 1) {
				//Add
				C206_CaseStudy.addbike(bikeList);
			} else if (itemType == 2) {
				//View
				C206_CaseStudy.viewbike(bikeList);
			}
			else if (itemType == 3) {
				//Delete
				C206_CaseStudy.deletebike(bikeList);
			} else {
				System.out.println("Invalid type");
			}
			
			
			
				
				
				
				
			} else if (option == option_bike) {
				//Add a new bike
				System.out.println("BIKE");			
				System.out.println("1.Add a new bike");
				System.out.println("2.View all bike");
				System.out.println("3.Delete an existing bike");
				
				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					//Add
					C206_CaseStudy.addbike(bikeList);
				} else if (itemType == 2) {
					//View
					C206_CaseStudy.viewbike(bikeList);
				}
				else if (itemType == 3) {
					//Delete
					C206_CaseStudy.deletebike(bikeList);
				} else {
					System.out.println("Invalid type");
				}
				
				
				
				
		

			} else if (option == option_quit) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}

		}

	}

    public static void menu() {
    	System.out.println("Bikers Community Portal");
    	System.out.println("-------------------------");
        System.out.println("1: User");
        System.out.println("2: Bike");
        System.out.println("3: Group");
        System.out.println("4: Discussion");
        System.out.println("5: Event");
        System.out.println("6: Registration");
        System.out.println("7: Quit");

    }
    
	//================================= Option 1  =================================

	//================================= Option 2  =================================
	
	public static String addbike(ArrayList<Biker> bikeList) {
		String output = "";

			
		return output;
	}
	
	public static void viewbike(ArrayList<Biker> bikeList) {
		System.out.println("i like coding");
	}
	public static void deletebike(ArrayList<Biker> bikeList) {
			
	}

}
