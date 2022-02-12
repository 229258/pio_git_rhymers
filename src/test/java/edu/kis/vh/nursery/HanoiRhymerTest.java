package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class HanoiRhymerTest {
	
	@Test
	public void testReportRejected() {
		final HanoiRhymer rhymer = new HanoiRhymer();
		final int testResult = 0;
		Assert.assertEquals(testResult, rhymer.reportRejected());
		rhymer.countIn(5);
		rhymer.countIn(6);
		Assert.assertEquals(1, rhymer.reportRejected());
	}
	
	@Test
	public void testCountIn() {
		final HanoiRhymer rhymer = new HanoiRhymer();
		final int testResult = 8;
		rhymer.countIn(testResult);
		Assert.assertEquals(testResult, rhymer.peekaboo());
	}
	
	@Test
	public void testCountInWithFalseCallCheck() {
		final HanoiRhymer rhymer = new HanoiRhymer();
		final int testResult = -1;
		rhymer.countIn(testResult);
		rhymer.countIn(testResult);
		Assert.assertEquals(testResult, rhymer.peekaboo());
	}
}
