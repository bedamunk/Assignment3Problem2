
final class Sports extends Cars {
	// instance variables
	private int raceStats;
	
	// constructors
	public Sports() {
		super();
	}

	public Sports(String make, String model, int year, int vinNumber, int raceStats, CarOwners owner) {
		super (make, model, year, vinNumber, owner);
		this.raceStats = raceStats;
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
	
	// setter method to set protected data field raceStats
			public void setRaceStats(int raceStats) {
				this.raceStats = raceStats;
			}
			
			
			
	// getter method to return private data field raceStats
			public int getRaceStats() {
				return this.raceStats;
			}
			
			
	@Override
	public String toString() {
		String sportscarinfo = "This car is a sports car.super.toString()"+  "\nRace Stats: " + this.raceStats;
		return sportscarinfo;
	}
}

