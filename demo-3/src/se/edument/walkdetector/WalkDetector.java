package se.edument.walkdetector;

public class WalkDetector {
	private Location startLocation;
	private boolean isWalking = false;
	
	public void startWalking() {
		isWalking = true;
		RealGPS gps = new RealGPS();
		startLocation = gps.getCurrentLocation();
	}
	
	public float getWalkingDistance() {
		if (!isWalking)
			throw new IllegalStateException("getWalkingDistance() called before startWalking()");
		RealGPS gps = new RealGPS();
		Location currentLocation = gps.getCurrentLocation();
		return currentLocation.distanceTo(startLocation);
	}
	
	public void stopWalking() {
		isWalking = false;
	}
}
