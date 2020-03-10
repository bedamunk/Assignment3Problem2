
final class Sedan extends Cars {
	
	// instance variables
	private int numDoors;
	private int trunkSize;
	

	// constructors
	public Sedan() {
		super();
	}
	
	public Sedan(String make, String model, int year, int vinNumber, int numDoors, int trunkSize, CarOwners owner) {
		super (make, model, year, vinNumber,owner);
		this.numDoors = numDoors;
		this.trunkSize = trunkSize;
	}
	// equals method
	public boolean equals (Object obj) {
		if(!(obj instanceof Sedan)) {
			return false;
		}
		boolean result = false;
		if(this.getVinNumber() == ((Cars)obj).getVinNumber()) {
			result = true;
		}
		return result;
	}
	    // setter method to set protected data field numDoors
				public void setNumDoors(int numDoors) {
					this.numDoors = numDoors;
				}	
				
		// getter method to return private data field numDoors
				public int getNumDoors() {
					return this.numDoors;
				}
				
				
		// setter method to set protected data field trunkSize
				public void setTrunkSize(int trunkSize) {
					this.trunkSize = trunkSize;
				}
				
								
		// getter method to return private data field trunkSize
				public int getTrunkSize() {
					return this.trunkSize;
				}		
	@Override
	public String toString() {
		String sedancarinfo = "This car is a sedan. " + super.toString() + "\nNumber of Doors: " + this.numDoors + "\nTrunk Size: " + this.trunkSize;
		return sedancarinfo;
	}
}


