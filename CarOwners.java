
public class CarOwners {
	

	/*
	 * @author Red Team
	 * Sam Allen
	 * Zachary Clevenger
	 * Amber Ferrebee
	 * Angela Johnson
	 * Bethanie Munkres
	 */

		// private instance variables
		protected String name;
		protected String address;
		
		public CarOwners() {
			
		}
		
		// constructor takes make model vinNumber and carType
		public CarOwners (String name, String address) {
			// set variables equal to the user input
			this.name = name;
			this.address = address;
		}
		// setters**************************************************************
		
		// setter method to set private data field name
		public void setName(String name) {
			this.name = name;
		}
		// setter method to set private data field model
		public void setAddress(String address) {
			this.address = address;
				}

		
		
		// getters**************************************************************
		
		// getter method to return private data field address
		public String getName() {
			return this.name;
		}
		// getter method to return private data field address
		public String getAddress() {
			return this.address;
		}

			
		// toString method
		public String toString() {
			String carinfo = "Owner Name: " + name + "\nOwner Address: " + address;
			return carinfo;
		}
	
}
