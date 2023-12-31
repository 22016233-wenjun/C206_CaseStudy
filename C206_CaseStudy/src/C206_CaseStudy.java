//
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
	private static final int option_registration = 6;
	private static final int option_quit = 7;


	public static void main(String[] args) {

		ArrayList<Biker> bikeList = new ArrayList<Biker>();
		ArrayList<BikeGroup> groupList = new ArrayList<BikeGroup>();
		ArrayList<Event> EventList = new ArrayList<Event>();
		ArrayList<BikeUser> UserList = new ArrayList<BikeUser>();
		ArrayList<Discussion> discussionList = new ArrayList<Discussion>();
		ArrayList<Registration> registrationList = new ArrayList<Registration>();
		
		int option = 0;

		while (option != option_quit) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");


			if (option == option_user) {
				//Add a new bike
				Helper.line(75,"=");
				System.out.println("USER");	
				Helper.line(75,"=");
				System.out.println("1.Add a new user");
				System.out.println("2.View all users");
				System.out.println("3.Delete an existing user");
				Helper.line(75,"=");
				
				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					//Add
					C206_CaseStudy.addUser(UserList, null);
					
				} else if (itemType == 2) {
					//View
					C206_CaseStudy.viewUser(UserList);
				}
				
				else if (itemType == 3) {
					//Delete
					C206_CaseStudy.deleteUser(UserList);
					
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
				
			}else if (option == option_discussion) {
			    System.out.println("Discussion");   
			    System.out.println("1. Add a new discussion");
			    System.out.println("2. View all discussions");
			    System.out.println("3. Delete a discussion");

			    int itemType = Helper.readInt("Enter option to select item type > ");

			    if (itemType == 1) {
			        // Add
			        addDiscussion(discussionList); // assuming discussionList exists
			    } else if (itemType == 2) {
			        // View
			        viewDiscussion(discussionList);
			    } else if (itemType == 3) {
			        // Delete
			        deleteDiscussion(discussionList);
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
					C206_CaseStudy.deleteEventList(EventList);
				}
			}
				else if (option == option_registration) {
	                // Registration
	                System.out.println("REGISTRATION");
	                System.out.println("1. Add a new registration");
	                System.out.println("2. View all registrations");
	                System.out.println("3. Delete an existing registration");

	                int itemTypes = Helper.readInt("Enter option to select item type > ");

	                if (itemTypes == 1) {
	                    // Add a new registration
	                    C206_CaseStudy.addRegistration(registrationList, null);
	                } else if (itemTypes == 2) {
	                    // View all registrations
	                    C206_CaseStudy.viewAllRegistrations(registrationList);
	                } else if (itemTypes == 3) {
	                    // Delete an existing registration
	                    C206_CaseStudy.deleteRegistration(registrationList);
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


	private static void addgroup(ArrayList<BikeGroup> groupList) {
		// TODO Auto-generated method stub
		
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
	static void addUser(ArrayList<BikeUser> UserList, BikeUser user) {
	    String name = getValidName(); 
	    int age = getValidAge(); 
	    String email = getValidEmail(); 
	    int phoneNo = getValidPhoneNumber(); 
	 
	    BikeUser newUser = new BikeUser(name, age, email, phoneNo); 
	    UserList.add(newUser); 
	 
	    System.out.println("**User has been added***\n"); 
	 
	    return; 
	} 
	 
		public static String getValidName() { 
		    while (true) { 
		        String name = Helper.readString("Enter your name > "); 
		        if (!name.trim().isEmpty() && !isInteger(name)) { 
		            return name; 
		        } 
		        if (name.trim().isEmpty()) { 
		            System.out.println("Name cannot be empty. Please try again."); 
		        } else { 
		            System.out.println("Name cannot be an integer. Please try again."); 
		        } 
		    } 
		} 
		 
		public static int getValidAge() { 
		    return Helper.readInt("Enter your age > "); 
		} 
		 
		public static String getValidEmail() { 
		    while (true) { 
		        String email = Helper.readString("Enter your email > "); 
		        if (isValidEmail(email)) { 
		            return email; 
		        } 
		        System.out.println("Invalid email format. Please try again."); 
		    } 
		} 
		 
		public static int getValidPhoneNumber() { 
		    while (true) { 
		        int phoneNo = Helper.readInt("Enter your phone number (8 digits) > "); 
		        if (phoneNo >= 10000000 && phoneNo <= 99999999) { 
		            return phoneNo; 
		        } 
		        System.out.println("Phone number must have exactly 8 digits. Please try again."); 
		    } 
		} 
		 
		public static boolean isValidEmail(String email) { 
		    String regex = "^[A-Za-z0-9+_.-]+@(.+)$"; 
		    return email.matches(regex); 
		} 
		 
		public static boolean isInteger(String input) { 
		    try { 
		        Integer.parseInt(input); 
		        return true; 
		    } catch (NumberFormatException e) { 
		        return false; 
		    } 
		}
			
	 public static String viewUser(ArrayList<BikeUser> UserList) {
		String output = "";

		output += String.format("%-20s %-10s %-25s %-15s\n", "Name", "Age", "Email", "Phone Number");

		for (BikeUser bu : UserList) {
			output += String.format("%-20s %-10d %-25s %-15d\n",
			          bu.getName(),
			          bu.getAge(),
			          bu.getEmail(),
			          bu.getPhoneNo());
		}

		System.out.println(output);
		return output;
	}

	 public static void deleteUser(ArrayList<BikeUser> UserList) {
		    String userToDelete = Helper.readString("Enter your name > ");
		    boolean userFound = false;

		    for (int bu = 0; bu < UserList.size(); bu++) {
		        if (UserList.get(bu) != null && UserList.get(bu).getName().equalsIgnoreCase(userToDelete)) {
		            char confirmDelete = Helper.readChar("Confirm deletion (y/n) > ");
		            if (confirmDelete == 'y' || confirmDelete == 'Y') {
		                UserList.remove(bu);
		                System.out.println("User " + userToDelete + " has been deleted!");
		            } else {
		                System.out.println("\nUser " + userToDelete + " has not been deleted!");
		            }
		            userFound = true;
		            break; 
		        }
		    }

		    if (!userFound) {
		        System.out.println("Error: User " + userToDelete + " not found!");
		    }
		}

	//================================= Option 2  =================================//

	public static ArrayList<Biker> addbike(ArrayList<Biker> bikeList) {

		String model = Helper.readString("Enter bike model>");
		String description= Helper.readString("Enter description >");
		String licenseno = Helper.readString("Enter license number >");
		String color = Helper.readString("Enter color>");
		double price = Helper.readDouble("Enter price >$");

		Biker newbike = new Biker(model, description,licenseno, color, price);

		bikeList.add(newbike);

		System.out.println("\n*** Bike has been added ***");

		return bikeList;
	}


	public static void viewbike(ArrayList<Biker> bikeList) {

		Helper.line(75,"=");
		System.out.println(String.format("%-10s %-30s %-15s %s","Model","Description","Color","Price"));
		Helper.line(75,"=");

		for (int i = 0; i< bikeList.size(); i++ ) {
			System.out.println(String.format("%-10s %-30s %-15s $%.2f",bikeList.get(i).getModel(),bikeList.get(i).getDescription(),bikeList.get(i).getColor(),bikeList.get(i).getPrice()));		

		}
		Helper.line(75,"-");
	}
	public static boolean deletebike(ArrayList<Biker> bikeList) {
		boolean bikeFound = false;

		System.out.println("List of Bikes:");
		System.out.println(String.format("%-10s %-30s %-15s %-15s %s","Model","Description","License No.","Color","Price"));
		Helper.line(75,"=");

		for (Biker biker : bikeList) {
			System.out.println(String.format("%-10s %-30s %-15s %-15s $%.2f",
					biker.getModel(),
					biker.getDescription(),
					biker.getlicenseno(),
					biker.getColor(),
					biker.getPrice()));
		}

		String removeBike = Helper.readString("\nEnter the bike license number to delete > ");

		for (int r = 0; r < bikeList.size(); r++) {
			if (bikeList.get(r) != null && bikeList.get(r).getlicenseno().equalsIgnoreCase(removeBike)) {
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
	public static void addGroup(ArrayList<BikeGroup> groupList, BikeGroup group) {
		
		
		int id = Helper.readInt("Enter group id > ");
		String name = Helper.readString("Enter group name > ");
		
		BikeGroup newgroup = new BikeGroup(id, name);
		groupList.add(newgroup);
		
		System.out.println("\n*** A New Group has been added ***");

		return;
	}
	
	public static void viewgroup(ArrayList<BikeGroup> groupList) {

		
		Helper.line(75,"=");
		System.out.println(String.format("%-10s %-30s","ID","GROUP NAME"));
		Helper.line(75,"=");

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
	
	
	//================================= Option 4: Discussions =================================//

	public static void viewDiscussion(ArrayList<Discussion> discussionList) {
	    Helper.line(75, "=");
	    System.out.println(String.format("%-10s %-30s %-25s %s", "ID", "Title", "Posted By", "Date"));
	    Helper.line(75, "=");
	    
	    for (Discussion discussion : discussionList) {
	        System.out.println(String.format("%-10d %-30s %-25s %s",
	                discussion.getId(),
	                discussion.getTitle(),
	                discussion.getPostedBy(),
	                discussion.getDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))));
	    }
	    Helper.line(75, "-");
	}

	public static void addDiscussion(ArrayList<Discussion> discussionList) {
	    int id = Helper.readInt("Enter discussion ID > ");
	    String title = Helper.readString("Enter discussion title > ");
	    String postedBy = Helper.readString("Enter your name > ");
	    LocalDate date = LocalDate.now();
	    
	    Discussion newDiscussion = new Discussion(id, title, postedBy, date);
	    discussionList.add(newDiscussion);
	    
	    System.out.println("\n*** New Discussion Added ***");
	}

	public static boolean deleteDiscussion(ArrayList<Discussion> discussionList) {
	    boolean discussionFound = false;

	    System.out.println("List of Discussions:");
	    viewDiscussion(discussionList);

	    int idToRemove = Helper.readInt("\nEnter the discussion ID to delete > ");
	    
	    for (int i = 0; i < discussionList.size(); i++) {
	        if (discussionList.get(i).getId() == idToRemove) {
	            char confirmDelete = Helper.readChar("Confirm deletion (y/n) > ");
	            if (confirmDelete == 'y' || confirmDelete == 'Y') {
	                discussionList.remove(i);
	                System.out.println("\n*** Discussion has been deleted ***");
	                discussionFound = true;
	            } else {
	                System.out.println("\n*** Deletion canceled ***");
	            }
	        }
	    }

	    if (!discussionFound) {
	        System.out.println("\n*** Discussion not found ***");
	    }

	    return discussionFound;
	}

	public static void addCommentToDiscussion(ArrayList<Discussion> discussionList) {
	    System.out.println("List of Discussions:");
	    viewDiscussion(discussionList);

	    int idToComment = Helper.readInt("\nEnter the discussion ID to add a comment > ");
	    
	    for (Discussion discussion : discussionList) {
	        if (discussion.getId() == idToComment) {
	            String comment = Helper.readString("Enter your comment > ");
	            discussion.addComment(comment);
	            System.out.println("\n*** Comment Added ***");
	            return;
	        }
	    }
	    System.out.println("\n*** Discussion not found ***");
	}

	
	//================================= Option 5  =================================//

	public static String displayEventList(ArrayList<Event> EventList) {


		//-------------------
		Helper.line(75, "-");
		String output ="";
		output += String.format("%-15s %-25s %-15s %s\n","Event Name","Description","Date","Time");
		for(int i = 0; i < EventList.size();i++ ) {
			output += String.format("%-15s %-25s %-15s %s\n",EventList.get(i).getName(),EventList.get(i).getDescription(),EventList.get(i).getDate(),EventList.get(i).gettime());

		}
		System.out.println(output);
		
	
		return output;

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
	public static boolean deleteEventList(ArrayList<Event> EventList) {

		boolean eventfound = false;

		//-------------------

		Helper.line(75, "-");
		String output ="";
		output += String.format("%-15s %-25s %-15s %s\n","Event Name","Description","Date","Time");
		for(int i = 0; i < EventList.size();i++ ) {
			output += String.format("%-15s %-25s %-15s %s\n",EventList.get(i).getName(),EventList.get(i).getDescription(),EventList.get(i).getDate(),EventList.get(i).gettime());

		}
		System.out.println(output);
		Helper.line(75, "-");
		//-------------------

		String EName = Helper.readString("Enter Event name > ");
		for(int i = 0; i < EventList.size(); i++ ) {
			if(EventList.get(i).getName().equalsIgnoreCase(EName)){
				eventfound = true;
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

		return eventfound;
	}
	
	//================================= Option 6  =================================

	static void addRegistration(ArrayList<Registration> registrationList, Registration registration) {
        System.out.println("ADD REGISTRATION");

        String name = Helper.readString("Enter participant's name: ");
        String email = Helper.readString("Enter participant's email: ");
        int contactNumber = Helper.readInt("Enter participant's contact number: ");

        Registration newRegistration = new Registration(name, email, contactNumber);
        registrationList.add(newRegistration);

        System.out.println("Registration added successfully!");
    }

    public static void viewAllRegistrations(ArrayList<Registration> registrationList) {
        System.out.println("VIEW ALL REGISTRATIONS");

        if (registrationList.isEmpty()) {
            System.out.println("No registrations found.");
            return;
        }

        for (Registration registration : registrationList) {
            System.out.println("Name: " + registration.getName());
            System.out.println("Email: " + registration.getEmail());
            System.out.println("Contact Number: " + registration.getContactNumber());
            System.out.println("---------------------------");
        }
    }

    public static void deleteRegistration(ArrayList<Registration> registrationList) {
        System.out.println("DELETE REGISTRATION");

        if (registrationList.isEmpty()) {
            System.out.println("No registrations found.");
            return;
        }

        for (int i = 0; i < registrationList.size(); i++) {
            System.out.println((i + 1) + ". Name: " + registrationList.get(i).getName());
            System.out.println("   Email: " + registrationList.get(i).getEmail());
            System.out.println("   Contact Number: " + registrationList.get(i).getContactNumber());
            System.out.println("---------------------------");
        }

        int selectedRegistration = Helper.readInt("Enter the number of the registration to delete: ");

        if (selectedRegistration < 1 || selectedRegistration > registrationList.size()) {
            System.out.println("Invalid selection.");
            return;
        }

        Registration deletedRegistration = registrationList.remove(selectedRegistration - 1);
        System.out.println("Registration for " + deletedRegistration.getName() + " deleted successfully!");
    }
}
