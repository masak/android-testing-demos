package se.edument.walkdetector;

public class Location {
	private float latitude;
	private float longitude;
	
	public Location(float latitude, float longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public float distanceTo(Location other) {
		float dLat = this.latitude - other.latitude;
		float dLong = this.longitude - other.longitude;
		return (float)Math.sqrt(dLat * dLat + dLong * dLong);
	}

	public float getLatitude() {
		return latitude;
	}

	public float getLongitude() {
		return longitude;
	}
}
