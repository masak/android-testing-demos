package se.edument.walkdetector;

public class MockGPS implements GPS {
	private Location location = new Location(0, 0);
	
	public void moveNorth(int km) {
		location = new Location(location.getLatitude() + km,
				                location.getLongitude());
	}

	public Location getCurrentLocation() {
		return location;
	}

}
