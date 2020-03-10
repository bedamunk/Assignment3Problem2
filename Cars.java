public class Cars {
	

	/*
	 * @author Red Team
	 * Sam Allen
	 * Zachary Clevenger
	 * Amber Ferrebee
	 * Angela Johnson
	 * Bethanie Munkres
	 */

		// private instance variables
		protected String make;
		protected String model;
		protected int year;
		protected int vinNumber;
		
		// private instance variable with aggregation type relationship
		protected CarOwners owner;
		
		public Cars() {
			this.make = "";
			this.model = "";
			this.year = 0;
			this.vinNumber = 0;
			
		}
		
		// constructor takes make model vinNumber and carType
		public Cars(String make, String model, int year, int vinNumber, CarOwners owner) {
			// set variables equal to the user input
			this.make = make;
			this.model = model;
			this.year = year;
			this.vinNumber = vinNumber;
			this.owner = owner;
		}
		// setters**************************************************************
		
		// setter method to set private data field make
		public void setMake(String make) {
			this.make = make;
		}
		// setter method to set private data field model
		public void setModel(String model) {
			this.model = model;
		}
		// setter method to set private data field model
		public void setYear(int year) {
			this.year = year;
		}
		// setter method to set private data field vinNumber
		public void setVinNumber(int vinNumber) {
			this.vinNumber = vinNumber;
		}
		// setter method to set protected data field owner
		public void setOwner(CarOwners owner) {
			this.owner = owner;
		}
		
		// getters**************************************************************
		
		// getter method to return private data field make
		public String getMake() {
			return this.make;
		}
		// getter method to return private data field model
		public String getModel() {
			return this.model;
		}
		// getter method to return private data field model
		public int getYear() {
			return this.year;
		}
		// getter method to return private data field vinNumber
		public int getVinNumber() {
			return this.vinNumber;
		}
		// setter method to set protected data field owner
		public CarOwners getOwner() {
			return this.owner;
		}
		
		// toString method
		public String toString() {
			String carinfo = owner.toString()+ "\nVin Number: " + this.vinNumber + "\nMake: " + this.make + 
			"\nModel: " + this.model;
			return carinfo;
		}
	
}
