package se.edument.walkdetector;

public class WalkDetector {
	private Location startLocation;
	private boolean isWalking = false;
	private GPS gps;

	public WalkDetector(GPS gps) {
		this.gps = gps;
	}
	
	public void startWalking() {
		isWalking = true;
		startLocation = gps.getCurrentLocation();
	}
	
	public float getWalkingDistance() {
		if (!isWalking)
			throw new IllegalStateException("getWalkingDistance() called before startWalking()");
		Location currentLocation = gps.getCurrentLocation();
		return currentLocation.distanceTo(startLocation);
	}
	
	public void stopWalking() {
		isWalking = false;
	}
}
