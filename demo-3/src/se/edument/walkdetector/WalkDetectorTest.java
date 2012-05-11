package se.edument.walkdetector;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class WalkDetectorTest {
	private WalkDetector detector;
	private MockGPS gps;

	@Before
	public void setUp() {
		gps = new MockGPS();
		detector = new WalkDetector(gps);
	}

	@Test
	public void zeroDistanceBeforeWalking() {
		detector.startWalking();
		Assert.assertEquals((float)0.0, detector.getWalkingDistance());
	}

	@Test
	public void someDistanceAfterWalking() {
		detector.startWalking();
		gps.moveNorth(2);
		Assert.assertEquals((float)2.0, detector.getWalkingDistance());
	}
}
