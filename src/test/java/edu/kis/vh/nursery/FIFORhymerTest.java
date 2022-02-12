package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class FIFORhymerTest {
	
	@Test
	public void testCountOut() {
		final FIFORhymer rhymer = new FIFORhymer();
		final int testResult = 123;
		rhymer.countIn(testResult);
		Assert.assertEquals(testResult, rhymer.countOut());
	}
	
	@Test
	public void testCountOutWhenLessCountsOutThanCountsIn() {
		final FIFORhymer rhymer = new FIFORhymer();
		final int testResult = 123;
		rhymer.countIn(testResult);
		rhymer.countIn(testResult);
		Assert.assertEquals(testResult, rhymer.countOut());
	}
}
