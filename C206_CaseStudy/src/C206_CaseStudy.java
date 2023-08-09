import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
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
		ArrayList<BikeGroup> groupList = new ArrayList<BikeGroup>();
		ArrayList<Event> EventList = new ArrayList<Event>();
		ArrayList<BikeUser> bikeUserList = new ArrayList<BikeUser>();
		
		int option = 0;

		while (option != option_quit) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");


			if (option == option_user) {
				//Add a new bike
				System.out.println("\nUSER");			
				System.out.println("1.Add a new user");
				System.out.println("2.View all users");
				System.out.println("3.Delete an existing user");
				
				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					//Add
					C206_CaseStudy.addUser(bikeUserList);
					
				} else if (itemType == 2) {
					//View
					C206_CaseStudy.viewUser(bikeUserList);
				}
				
				else if (itemType == 3) {
					//Delete
					C206_CaseStudy.deleteUser(bikeUserList);
					
				} else {
					System.out.println("Invalid type");
				}


			} else if (option == option_bike) {
				//Add a new bike
				Helper.line(75,"=");
				System.out.println("BIKE");	
				Helper.line(75,"=");
				System.out.println("1.Add a new bike");
				System.out.println("2.View all bike");
				System.out.println("3.Delete an existing bike");
				Helper.line(75,"=");

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


			} else if (option == option_group) {
				// Add a new group
				System.out.println("\nGROUP");
				Helper.line(30, "-");
				System.out.println("1. Add a new group");
				System.out.println("2. View all groups");
				System.out.println("3. Delete an existing group");

				int itemType = Helper.readInt("\nEnter option to select item type > ");

				if (itemType == 1) {
					// Add
					C206_CaseStudy.addgroup(groupList);
				} else if (itemType == 2) {
					// View
					C206_CaseStudy.viewgroup(groupList);
				} else if (itemType == 3) {
					// Delete
					C206_CaseStudy.deletegroup(groupList);
				} else {
					System.out.println("Invalid type");
				}
				
			}else if (option == option_event) {
				//Add a new bike
				System.out.println("Event");   
				System.out.println("1.Add a new event");
				System.out.println("2.View all events");
				System.out.println("3.Delete an existing event");

				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					//Add
					C206_CaseStudy.addEvent(EventList);
				} else if (itemType == 2) {
					//View
					C206_CaseStudy.displayEventList(EventList);
				}
				else if (itemType == 3) {
					//View
					C206_CaseStudy.DeleteEventList(EventList);



				}



			} else if (option == option_quit) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}

		}

	}

	public static void menu() {
		Helper.line(75,"-");
		System.out.println("Bikers Community Portal");
		Helper.line(75,"-");
		System.out.println("1: User");
		System.out.println("2: Bike");
		System.out.println("3: Group");
		System.out.println("4: Discussion");
		System.out.println("5: Event");
		System.out.println("6: Registration");
		System.out.println("7: Quit");

	}

	//================================= Option 1  =================================
	 public static ArrayList<BikeUser> addUser(ArrayList<BikeUser> bikeUserList) {
	    	String name = Helper.readString("Enter your name > ");
	    	int age = Helper.readInt("Enter your age > ");
	    	String email = Helper.readString("Enter your email > ");
	    	int phoneNo = Helper.readInt("Enter your phone number > ");

	    	BikeUser bu= new BikeUser(name, age, email, phoneNo);
	    	bikeUserList.add(bu);
			
	    	System.out.println("**User has been added***\n");
	    	
	    	return bikeUserList;
	    }
		
	    public static void viewUser(ArrayList<BikeUser> bikeUserList) {
			 String output = "";

			    // Header
			    output += String.format("%-15s %-15s %-15s %-15s\n", "Name", "Age", "Email", "Phone Number");

			    // Items
			    for (BikeUser bu : bikeUserList) {
			        output += String.format("%-15s %-15d %-15s %-15d\n",
			                bu.getName(),
			                bu.getAge(),
			                bu.getEmail(),
			                bu.getPhoneNo());
			    }

			    System.out.println(output);
			}

	    public static void deleteUser(ArrayList<BikeUser> bikeUserList) {
	    	boolean UserFound = false;
	    	String userToDelete = Helper.readString("Enter your name > ");

	        for (int bu = 0; bu < bikeUserList.size(); bu++) {
		        if (bikeUserList.get(bu)!= null && bikeUserList.get(bu).getName().equalsIgnoreCase(userToDelete)){
		            char confirmDelete = Helper.readChar("Confirm deletion (y/n) > ");
		            if (confirmDelete == 'y' || confirmDelete == 'Y') {
		            	bikeUserList.remove(bu);
		            	System.out.println("User " + userToDelete + " has been deleted!");
		            	UserFound = true;
		        } else {
		            System.out.println("User " + userToDelete + " has not been deleted!\n");
		        }
	        }
	        
		        if(!UserFound) {
		        	System.out.println("Error: User " + userToDelete + " not found!");
		        }
	        }
	    }

	//================================= Option 2  =================================//

	public static ArrayList<Biker> addbike(ArrayList<Biker> bikeList) {

		//asking the questions of the bike
		String model = Helper.readString("Enter bike model>");
		String description= Helper.readString("Enter description >");
		String color = Helper.readString("Enter color>");
		double price = Helper.readDouble("Enter price >$");

		Biker newbike = new Biker(model, description, color, price);

		bikeList.add(newbike);

		System.out.println("\n*** Bike has been added ***");

		return bikeList;
	}




	public static void viewbike(ArrayList<Biker> bikeList) {

		//Header
		Helper.line(75,"=");
		System.out.println(String.format("%-10s %-30s %-15s %s","Model","Description","Color","Price"));
		Helper.line(75,"=");

		//information and amount
		for (int i = 0; i< bikeList.size(); i++ ) {
			System.out.println(String.format("%-10s %-30s %-15s $%.2f",bikeList.get(i).getModel(),bikeList.get(i).getDescription(),bikeList.get(i).getColor(),bikeList.get(i).getPrice()));		

		}
		Helper.line(75,"-");
	}
	public static boolean deletebike(ArrayList<Biker> bikeList) {
		boolean bikeFound = false;

		// Display the list of bikes
		System.out.println("List of Bikes:");
		System.out.println(String.format("%-10s %-30s %-15s %s","Model","Description","Color","Price"));
		Helper.line(75,"=");

		for (Biker biker : bikeList) {
			System.out.println(String.format("%-10s %-30s %-15s $%.2f",
					biker.getModel(),
					biker.getDescription(),
					biker.getColor(),
					biker.getPrice()));
		}

		String removeBike = Helper.readString("\nEnter the bike model to delete > ");

		for (int r = 0; r < bikeList.size(); r++) {
			if (bikeList.get(r) != null && bikeList.get(r).getModel().equalsIgnoreCase(removeBike)) {
				char confirmDelete = Helper.readChar("Confirm deletion (y/n) > ");
				if (confirmDelete == 'y' || confirmDelete == 'Y') {
					bikeList.remove(r);
					System.out.println("\n*** Bike has been deleted ***");
					bikeFound = true;
				} else {
					System.out.println("\n*** Deletion canceled ***");
				}
			}
		}

		if (!bikeFound) {
			System.out.println("\n*** Bike not found ***");
		}

		return bikeFound;
	}
	
	//================================= Option 3  =================================//
	
	public static ArrayList<BikeGroup> addgroup(ArrayList<BikeGroup> groupList) {
		
		int id = Helper.readInt("Enter group id > ");
		String name = Helper.readString("Enter group name > ");
		
		BikeGroup newgroup = new BikeGroup(id, name);
		groupList.add(newgroup);
		
		System.out.println("\n*** A New Group has been added ***");

		return groupList;
	}
	
	public static void viewgroup(ArrayList<BikeGroup> groupList) {

		//Title
		Helper.line(75,"=");
		System.out.println(String.format("%-10s %-30s","ID","GROUP NAME"));
		Helper.line(75,"=");

		//list details
		for (int i = 0; i< groupList.size(); i++ ) {
			System.out.println(String.format("%-10d %-30s", groupList.get(i).getId(), groupList.get(i).getName()));		

		}
	}
	
	public static boolean deletegroup(ArrayList<BikeGroup> groupList) {
		boolean groupFound = false;

		// Display the list of groups
		System.out.println("List of Groups:");
		System.out.println(String.format("%-10s %-30s","ID","GROUP NAME"));
		Helper.line(75,"=");

		for (BikeGroup group : groupList) {
			System.out.println(String.format("%-10d %-30s",
					group.getId(), group.getName()));
		}

		String removeGroup = Helper.readString("\nEnter the bike group to delete > ");

		for (int i = 0; i < groupList.size(); i++) {
			if (groupList.get(i) != null && groupList.get(i).getName().equals(removeGroup)) {
				char confirmDelete = Helper.readChar("Confirm deletion (y/n) > ");
				if (confirmDelete == 'y' || confirmDelete == 'Y') {
					groupList.remove(i);
					System.out.println("\n*** Group has been deleted ***");
					groupFound = true;
				} else {
					System.out.println("\n*** Group is not deleted ***");
				}
			}
		}

		if (!groupFound) {
			System.out.println("\n*** Group not found ***");
		}

		return groupFound;
	}
	
	//================================= Option 5  =================================//



	public static void  displayEventList(ArrayList<Event> EventList) {


		//-------------------
		Helper.line(75, "-");
		String output ="";
		output += String.format("%-10s %-25s %-15s %s\n","Event Name","Description","Date","Time");
		for(int i = 0; i < EventList.size();i++ ) {
			output += String.format("%-10s %-25s %-15s %s",EventList.get(i).getName(),EventList.get(i).getDescription(),EventList.get(i).getDate(),EventList.get(i).gettime());

		}
		System.out.println(output);
		Helper.line(75, "-");
		//-------------------

	}
	public static void addEvent(ArrayList<Event> EventList) {

		//-------------------
		String Name = Helper.readString("Enter event Name > ");
		String description = Helper.readString("Enter description > ");
		String Date = Helper.readString("Enter date of event> ");
		String Time = Helper.readString("Enter time of event > ");

		LocalDate date = LocalDate.parse(Date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		LocalTime time = LocalTime.parse(Time, DateTimeFormatter.ofPattern("HH:mm"));

		System.out.println(" ");

		EventList.add(new Event(Name, description,Date,Time ));

		System.out.println(" ");

		System.out.println("* Event has been added * ");
		//-------------------

	}
	public static boolean DeleteEventList(ArrayList<Event> EventList) {

		boolean patientfound = false;

		//-------------------

		Helper.line(75, "-");
		String output ="";
		output += String.format("%-15s %-25s %-15s %s\n","Event Name","Description","Date","Time");
		for(int i = 0; i < EventList.size();i++ ) {
			output += String.format("%-15s %-25s %-15s %s",EventList.get(i).getName(),EventList.get(i).getDescription(),EventList.get(i).getDate(),EventList.get(i).gettime());

		}
		System.out.println(output);
		Helper.line(75, "-");
		//-------------------

		String EName = Helper.readString("Enter Event name > ");
		for(int i = 0; i < EventList.size(); i++ ) {
			if(EventList.get(i).getName().equalsIgnoreCase(EName)){
				patientfound = true;
				String cfm = Helper.readString("Confirm deletion (y/n) > ");
				if(cfm.equals("y")) {
					EventList.remove(i);

					System.out.println(" ");
					System.out.println("* Event has been deleted * ");

				}
				else {

				}
			}
		}

		return patientfound;
	}
	////
}






