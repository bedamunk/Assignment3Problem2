
import java.util.ArrayList;
import java.util.*;

public class UseCars {
	int sportsCarCounter = 0;
	// Create scanner	
    Scanner input = new Scanner(System.in);
    // Create an ArrayList that stores references of any type of cars
 	static ArrayList<Cars> carsArray = new ArrayList<Cars>();
 	static ArrayList<CarOwners> ownersArray = new ArrayList<CarOwners>();

	public static void main(String[] args) {
		
		// Create car owners and add each of them to an array of car owners
		CarOwners owner1 = new CarOwners("Barbara Biscuit", "31 Spooner Street, Quahog, Rhode Island");
		ownersArray.add(owner1);
		CarOwners owner2 = new CarOwners("Ingrid Jackson", "320 Fowler Street, Lynbrook, New York");
		ownersArray.add(owner2);
		CarOwners owner3 = new CarOwners("Darius Stone", "1640 Riverside Drive, Hill Valley, California");
		ownersArray.add(owner3);
		CarOwners owner4 = new CarOwners("Johny Madrid", "4 Privet Drive, Little Whinging, SomeState");
		ownersArray.add(owner4);
		CarOwners owner5 = new CarOwners("Bella Lovelace", "510 Glenview Drive, Detroit, Michigan");
		ownersArray.add(owner5);
				
		// Create Sports cars and add each of them to an array of cars
		Sports car1 = new Sports("BMW", "M3", 2017, 1, 6, owner1);
		carsArray.add(car1);
		Sports car2 = new Sports("Chevrolet", "Carmaro", 2016, 2, 5, owner2);
		carsArray.add(car2);
		Sports car3 = new Sports("Ford", "Mustang", 2020, 3, 6, owner3);
		carsArray.add(car3);
		Sports car4 = new Sports("Mazda", "Miata", 2000, 4, 4, owner4);
		carsArray.add(car4);
		Sports car5 = new Sports("Nissan", "370z", 2018, 5, 5, owner5);
		carsArray.add(car5);
		
		// Create Sedan cars and add each of them to an array of cars
		Sedan car6 = new Sedan("Toyota", "Avalon", 1990,  6, 4, 2, owner1);
		carsArray.add(car6);
		Sedan car7 = new Sedan("Audi", "A6", 7, 4, 2010,  3, owner1);
		carsArray.add(car7);
		Sedan car8 = new Sedan("Genesis", "G70", 2020, 8, 4, 1, owner1);
		carsArray.add(car8);
		Sedan car9 = new Sedan("Porsche", "Panamera", 2019, 9, 4, 3, owner2);
		carsArray.add(car9);
		Sedan car10 = new Sedan("Nissan", "Versa", 2018, 10, 4, 2, owner1);
		carsArray.add(car10);
		
		// Call method that gathers information for a new Sports car 
		// and add it to the cars array list
		carsArray.add(getNewSportsCarInfo());
		
		// Call method that gathers information for a new Sedan car 
		//and add it to the cars array list
		carsArray.add(getNewSedanCarInfo());
		
		// Search for a particular car and display its information 
		vinNumberSearch();
		
				
		// display all the cars that are currently stored in the Cars array list
		displayCarsArrayInfo();
	
	}
	
	// Create a method that requests information about a new car owner
	public static CarOwners getNewOwner() {
		Scanner ownerInput = new Scanner(System.in);
		CarOwners newOwner = new CarOwners();
        System.out.println("Ok, let's gather some information about the new car owner.");
        System.out.println();
        System.out.println("Please enter the car owner's first name: ");
        String firstName = ownerInput.nextLine();
        System.out.println("Please enter the car owner's last name: ");
        String lastName = ownerInput.nextLine();
        String name = firstName + " " + lastName;
        // Set name for CarOwners newOwner object
        newOwner.setName(name);
        System.out.println("Thank you.  Now please enter the car owner's address: ");
        // Set address for CarOwners newOwner object
        String address = ownerInput.nextLine();
        newOwner.setAddress(address);
        System.out.println("Thank you.  The information you entered will be used to register the new owner.");
        // return a reference of a newly instantiated owner
        return newOwner;
       
	}

	// getNewSportsCarInfo() requests information about a Sports car, 
	// instantiates a Sports can and then adds it to the Cars array list.
	public static Sports getNewSportsCarInfo() {
		Sports newCar = new Sports();
		Scanner sportsInput = new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println("Time to enter information about a new sports car.");
		System.out.println("Please enter the make: ");
		String make = sportsInput.nextLine();
		newCar.setMake(make);
		System.out.println("Please enter the model: ");
		String model = sportsInput.nextLine();
		newCar.setModel(model);
		int year;
		do {
			System.out.println("Please enter the model year (between 1886 and 2023) :");
		// While loop used to catch input other than int type
			while (!sportsInput.hasNextInt()) {
				System.out.println ("That's not a year.  Please enter a year between 1886 "
						+ "and 2023 for the car: ");
				sportsInput.next();
			}year = sportsInput.nextInt();	
		} while (year < 1886 || year > 2023);
		newCar.setYear(year);
		int vinNumber;
			System.out.println("Please enter the vin number (integer value): ");
		// While loop used to catch input other than int type
		while (!sportsInput.hasNextInt()) {
			System.out.println ("That's not an integer.  Please enter an integer value for the "
					+ "vin number: ");
			sportsInput.next();
		}
		 vinNumber = sportsInput.nextInt();
		// advances scanner to next line after nextInt()
		sportsInput.nextLine();
		for (Cars search : carsArray) {			
			while(search.getVinNumber() == vinNumber) {
				System.out.println("Sorry, " +  vinNumber + " is taken.  Please enter a different "
						+ "integer for the vin number: ");
				vinNumber = sportsInput.nextInt();
			}
			
		}
		newCar.setVinNumber(vinNumber);
		System.out.println("Please enter the number of seconds needed for the car to reach 60mph from resting: ");
		// While loop used to catch input other than int type
		while (!sportsInput.hasNextInt()) {
			System.out.println ("That's not an integer.  "
					+ "\nPlease enter an integer value for the number of seconds needed for the car to "
					+ "reach 60mph from resting: ");
			sportsInput.next();
		}
		int raceStats = sportsInput.nextInt();
		// advances scanner to next line after nextInt()
		sportsInput.nextLine();
		newCar.setRaceStats(raceStats);
		System.out.println("Is this car owned by someone already registered as a car owner? ");
		System.out.println("(1)Press 1 for yes and to search for that owner.");
		System.out.println("----");
		System.out.println("OR");
		System.out.println("----");
		System.out.println("(2)Press any other integer for no and to create a new owner in the system: ");
		while(!sportsInput.hasNextInt()) {
			System.out.println("That's not an integer.  \nPlease enter 1 to search for an existing owner or "
					+ "any other integer to create a new owner in the system: ");
		    sportsInput.next();
		}
		int ownerType = sportsInput.nextInt();
		// advances scanner to next line after nextInt()
		sportsInput.nextLine();
		String carOwnerSearchResults = "";
		if (ownerType == 1){
			System.out.println("Ok, lets search for the owner." + 
		"\nPlease enter the first and last name of the owner separated by a space." 
					+ "This must be an exact match: ");
			String ownerSearchString = sportsInput.nextLine();
			for (CarOwners search : ownersArray) {	
				String ownerSearchName = search.getName();
				if(ownerSearchName.contentEquals(ownerSearchString)) {
					carOwnerSearchResults = "Your search on name: " + ownerSearchString + " yielded the "
							+ "following information: ";

					System.out.println(carOwnerSearchResults);
					String name = search.getName();
					String address = search.getAddress();
					System.out.println("+---------------+-------------------------------------------------"
							+ "----------------------------------------------+");
					System.out.printf("%-2s%-14s%-2s%-14s\n", "|", "Owner Name", "|", name);
					System.out.println("+-------------------------------------------------------------------"
							+ "--------------------------------------------+");
					System.out.println("+---------------+---------------------------------------------------"
							+ "--------------------------------------------+");
					
						System.out.printf("%-2s%-14s%-2s%-14s\n", "|", 
								"Owner Address", "|", address);
				
					System.out.println("+---------------+----------------------------------------------------"
							+ "-------------------------------------------+");
				Scanner correctOwner = new Scanner(System.in);
				System.out.println("Is this the correct owner? ");
				System.out.println("Press 1 to register this owner information for the new sports car.  Press"
						+ " any other integer to register a new owner instead.");
				while(!correctOwner.hasNextInt()) {
					System.out.println("That's not an integer.  "
							+ "\nPlease press 1 to register this owner information for the new sports car.  "
							+ "Press any other integer to register a new owner instead. ");
				   correctOwner.next();
				}
				int enterFoundOwner = correctOwner.nextInt();
				if (enterFoundOwner == 1) {
				newCar.setOwner(search);
				}
					else if (enterFoundOwner != 1) {
						newCar.setOwner(getNewOwner());
					}
				}
				else if (!ownerSearchName.contentEquals(ownerSearchString)){
				
				}
			
				if (carOwnerSearchResults.isEmpty() == true){
					carOwnerSearchResults = "Your search on name: " + ownerSearchString + " yielded no results.";
					System.out.println(carOwnerSearchResults);
					System.out.println("Let's go ahead and create a new owner to register in the system for this car.");
					
					newCar.setOwner(getNewOwner());
				}
				
			}
				
					
				}
		else if (ownerType != 1) {
			newCar.setOwner(getNewOwner());
			
		}
		return newCar;	
			
	}

	
	// getNewSedanCarInfo() requests information about a Sedan car, 
	// instantiates a Sedan can and then adds it to the Cars array list.
	public static Sedan getNewSedanCarInfo() {
		Sedan newCar  = new Sedan();
		System.out.println();
		System.out.println();
		Scanner sedanInput = new Scanner(System.in);
		System.out.println("Time to enter information about a new sedan car.");
		System.out.println("Please enter the make: ");
		String make = sedanInput.nextLine();
		newCar.setMake(make);
		System.out.println("Please ener the model: ");
		String model = sedanInput.nextLine();
		newCar.setModel(model);
		int year;
		do {
			System.out.println("Please enter the model year (between 1886 and 2023) :");
			// While loop used to catch input other than int type
			while (!sedanInput.hasNextInt()) {
				System.out.println ("That's not a year.  Please enter a year between 1886 "
						+ "and 2023 for the car: ");
				sedanInput.next();
			}year = sedanInput.nextInt();
	// advances scanner to next line after nextInt()
			sedanInput.nextLine();
		} while (year < 1886 || year > 2023);
		newCar.setYear(year);
		
		System.out.println("Please enter the vin number (an integer value): ");
		while(!sedanInput.hasNextInt()) {
			System.out.println("That's not an integer.  "
					+ "\nPlease enter an integer value for the vin number: ");
		    sedanInput.next();
		}
		int vinNumber = sedanInput.nextInt();
		
		sedanInput.nextLine();
		for (Cars search : carsArray) {			
			while(search.getVinNumber() == vinNumber) {
				System.out.println("Sorry, " +  vinNumber + " is taken.  Please enter a different "
						+ "integer for the vin number: ");
				while(!sedanInput.hasNextInt()) {
					System.out.println("That's not an integer.  "
							+ "\nvinNumber + \" is taken.  Please enter a different integer for "
							+ "the vin number: ");
				    sedanInput.next();
				}
				vinNumber = sedanInput.nextInt();
				
		// advances scanner to next line after nextInt()
				sedanInput.nextLine();
			}
		}
		newCar.setVinNumber(vinNumber);
		System.out.println("Please enter the number of doors: ");
		System.out.println("Please use an integer.");
		
		while(!sedanInput.hasNextInt()) {
			System.out.println("That's not an integer.  "
					+ "\nPlease enter an integer for the number of doors");
		    sedanInput.next();
		}
		int numDoors = sedanInput.nextInt();
		
		// advances scanner to next line after nextInt()
		sedanInput.nextLine();
		newCar.setNumDoors(numDoors);
		System.out.println("Please enter the cubic feet for the trunk size: ");
		while(!sedanInput.hasNextInt()) {
			System.out.println("That's not an integer.  "
					+ "\nPlease enter an integer for the cubic feet measurement of the trunk size: ");
		    sedanInput.next();
		}
		int trunkSize = sedanInput.nextInt();
		
		// advances scanner to next line after nextInt()
		sedanInput.nextLine();
		newCar.setTrunkSize(trunkSize);
		System.out.println("Is this car owned by someone already registered as a car owner? ");
		System.out.println("(1)Press 1 for yes and to search for that owner.");
		System.out.println("----");
		System.out.println("OR");
		System.out.println("----");
		System.out.println("(2)Press any other integer for no and to create a new owner in the system: ");
		while(!sedanInput.hasNextInt()) {
			System.out.println("That's not an integer.  \nPlease enter 1 to search for an existing "
					+ "owner or any other integer to create a new owner in the system: ");
		    sedanInput.next();
		}
		int ownerType = sedanInput.nextInt();
		// advances scanner to next line after nextInt()
		sedanInput.nextLine();
		String carOwnerSearchResults = "";
		if (ownerType == 1){
			System.out.println("Ok, lets search for the owner." + 
		"\nPlease enter the first and last name of the owner separated by a space." 
					+ "This must be an exact match: ");
			String ownerSearchString = sedanInput.nextLine();
			for (CarOwners search : ownersArray) {	
				String ownerSearchName = search.getName();
				if(ownerSearchName.contentEquals(ownerSearchString)) {
					carOwnerSearchResults = "Your search on name: " + ownerSearchString + " yielded "
							+ "the following information: ";

					System.out.println(carOwnerSearchResults);
					String name = search.getName();
					String address = search.getAddress();
					System.out.println("+---------------+---------------------------------------------"
							+ "--------------------------------------------------+");
					System.out.printf("%-2s%-14s%-2s%-14s\n", "|", "Owner Name", "|", name);
					System.out.println("+--------------------------------------------------------------"
							+ "-------------------------------------------------+");
					System.out.println("+---------------+----------------------------------------------"
							+ "-------------------------------------------------+");
					
						System.out.printf("%-2s%-14s%-2s%-14s\n", "|", 
								"Owner Address", "|", address);
				
					System.out.println("+---------------+-----------------------------------------------"
							+ "------------------------------------------------+");
				Scanner correctOwner = new Scanner(System.in);
				System.out.println("Is this the correct owner? ");
				System.out.println("Press 1 to register this owner information for the new sports car. "
						+ " Press any other integer to register a new owner instead.");
				while(!correctOwner.hasNextInt()) {
					System.out.println("That's not an integer.  "
							+ "\nPlease press 1 to register this owner information for the new sports car. "
							+ " Press any other integer to register a new owner instead. ");
				   correctOwner.next();
				}
				int enterFoundOwner = correctOwner.nextInt();
				if (enterFoundOwner == 1) {
				newCar.setOwner(search);
				}
					else if (enterFoundOwner != 1) {
						newCar.setOwner(getNewOwner());
					}
				}
				else if (!ownerSearchName.contentEquals(ownerSearchString)){
				
				}
			
				if (carOwnerSearchResults.isEmpty() == true){
					carOwnerSearchResults = "Your search on name: " + ownerSearchString + " yielded no results.";
					System.out.println(carOwnerSearchResults);
					System.out.println("Let's go ahead and create a new owner to register in the system for this car.");
					
					newCar.setOwner(getNewOwner());
				}
				
			}
				
					
				}
		else if (ownerType != 1) {
			newCar.setOwner(getNewOwner());
			
		}
		return newCar;	
			
	}


	// vinNumberSearch() finds and displays the information about a given car
	// based on a provided VIN number
	public static void vinNumberSearch() {
		String vinSearchCarResults = "";
		Scanner vinNumberInput = new Scanner(System.in);
		int searchAgain;
		do {
		System.out.println();
		System.out.println("Please enter a Vin Number (any number from 1 to 2147483647) to search for a car: ");
		while(!vinNumberInput.hasNextInt()) {
			System.out.println("That's not an integer.  "
					+ "\nPlease enter a Vin Number (any number from 1 to 2147483647) to search for a car: ");
		    vinNumberInput.next();
		}
		int vinSearchNumber = vinNumberInput.nextInt();
		// Search for VIN number
		for (Cars search : carsArray) {	
		// if VIN number searched on matches a registered car, display toString() results for that car
			if(search.getVinNumber() == vinSearchNumber) {
				vinSearchCarResults = "Your search on vin number " + vinSearchNumber + " yielded the following "
						+ "information: \n ------------------------------------------------\n" + search.toString();
			}
		// if VIN number searched on does not match a registered car, print message showing no results
			if (vinSearchCarResults.isEmpty() == true){
				vinSearchCarResults = "Your search on vin number " + vinSearchNumber + " yielded no results.";
			}
		}
		// Print results from above either match or no match results
		System.out.println(vinSearchCarResults);
		// Print message offering another search.  '1' for search again or any other int for no further search
		System.out.println("Would you like to search again?  Enter 1 to search again.  \nEnter any other integer "
				+ "to continue without another search. ");
		Scanner searchAgainInput = new Scanner(System.in);
		// While loop used to catch input other than int type
		while (!searchAgainInput.hasNextInt()) {
			System.out.println("That input was incorrect.  \nPlease enter 1 to search again.  \nEnter any other"
					+ " integer to continue without another search. ");
			searchAgainInput.next();
		}
		searchAgain = searchAgainInput.nextInt();
	// While loop to continue searching if user continues to choose '1'	
	}while(searchAgain == 1);
	}
	
	// Display information about all registered cars and corresponding owners
	public static void displayCarsArrayInfo() {
		int trunkSize = 0;
		int numDoors = 0;
		int raceStats = 0;
		String carType = "";
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("List of cars currently registered in the system:");
		System.out.println("+---------------+---------------+---------------+---------------+---------------+---------"
				+ "------+---------------+-------------------+-------------------+------------------------------------"
				+ "------------");
		// Print column headings for table to display registered car information
		System.out.printf("%-2s%-14s%-2s%-14s%-2s%-14s%-2s%-14s%-2s%-14s%-2s%-14s%-2s%-14s%-2s%-18s%-2s%-18s%-2s%-1s\n",
				"|", "Car Type", "|", "Make", "|", "Model", "|", "Year", "|", "Vin Number", "|", "Race Stats", "|", 
				"Trunk Size", "|", "Number of Doors", "|", "Owner Name", "|", "Owner Address");
		System.out.println("+---------------+---------------+---------------+---------------+---------------+-----------"
				+ "----+---------------+-------------------+-------------------+------------------------------------------------");
		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-"
				+ "+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		System.out.println("+---------------+---------------+---------------+---------------+---------------+----------"
				+ "-----+---------------+-------------------+-------------------+------------------------------------------------");
		for (Cars getThatInfo : carsArray) {
			if(getThatInfo instanceof Sedan) {
				trunkSize = ((Sedan)getThatInfo).getTrunkSize();
				numDoors = ((Sedan)getThatInfo).getNumDoors();
				carType = "Sedan";
		// Print a row for car information if object is Sedan
				System.out.printf("%-2s%-14s%-2s%-14s%-2s%-14s%-2s%-14d%-2s%-14d%-2s%-14s%-2s%-14d%-2s%-18d%-2s%-18s%-2s%-1s\n", "|", 
						carType, "|", getThatInfo.getMake(), "|", getThatInfo.getModel(), "|", getThatInfo.getYear(), "|", 
						getThatInfo.getVinNumber(), "|", "N/A", "|", trunkSize, "|", numDoors, "|", getThatInfo.owner.getName(), "|", getThatInfo.owner.getAddress());
			} else if(getThatInfo instanceof Sports) {
				raceStats = ((Sports)getThatInfo).getRaceStats();
				carType = "Sports";
		// Print a row for car information if object is Sports
				System.out.printf("%-2s%-14s%-2s%-14s%-2s%-14s%-2s%-14d%-2s%-14d%-2s%-14d%-2s%-14s%-2s%-18s%-2s%-18s%-2s%-1s\n", "|", 
						carType, "|", getThatInfo.getMake(), "|", getThatInfo.getModel(), "|", getThatInfo.getYear(), "|", 
						getThatInfo.getVinNumber(), "|", raceStats, "|", "N/A", "|", "N/A", "|", getThatInfo.owner.getName(), "|", getThatInfo.owner.getAddress(), "|");
			}
			System.out.println("+---------------+---------------+---------------+---------------+---------------+---------------+---"
					+ "------------+-------------------+-------------------+------------------------------------------------");
			
		}
	}

}
