
final class Sports extends Cars {
	// instance variables
	private int raceStats;
	
	// constructors
	public Sports() {
		
		
	}

	public Sports(String make, String model, int year, int vinNumber, int raceStats, CarOwners owner) {
		super (make, model, year, vinNumber, owner);
		this.raceStats = raceStats;
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
		String sportscarinfo = super.toString() +  "\nRace Stats: " + raceStats;
		return sportscarinfo;
	}
}

