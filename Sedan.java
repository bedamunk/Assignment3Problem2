
final class Sedan extends Cars {
	
	// instance variables
	private int numDoors;
	private int trunkSize;
	
	public Sedan() {
		
	}
	
	// constructors
	public Sedan(String make, String model, int year, int vinNumber, int numDoors, int trunkSize, CarOwners owner) {
		super (make, model, year, vinNumber,owner);
		this.numDoors = numDoors;
		this.trunkSize = trunkSize;
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
		String sedancarinfo = super.toString() + "\nNumber of Doors: " + numDoors + "\nTrunk Size: " + trunkSize;
		return sedancarinfo;
	}
}


