package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class DefaultCountingOutRhymerTest {

	@Test
	public void testCountIn() {
		final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int testValue = 123;
		rhymer.countIn(testValue);
		Assert.assertEquals(testValue, rhymer.peekaboo());
	}

	@Test
	public void testCallCheck() {
		final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		Assert.assertTrue(rhymer.callCheck());
		rhymer.countIn(123);
		Assert.assertFalse(rhymer.callCheck());
	}

	@Test
	public void testIsNotFull() {
		final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY / 2; i++) {
			Assert.assertFalse(rhymer.isFull());
			rhymer.countIn(123);
		}
		Assert.assertFalse(rhymer.isFull());
	}
	
	@Test
	public void testIsFull() {
		final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			Assert.assertFalse(rhymer.isFull());
			rhymer.countIn(123);
		}
		Assert.assertTrue(rhymer.isFull());
	}
	
	@Test
	public void testIsFullWithOverflow() {
		final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			Assert.assertFalse(rhymer.isFull());
			rhymer.countIn(123);
		}
		rhymer.countIn(123);
		Assert.assertTrue(rhymer.isFull());
	}

	@Test
	public void testPeekaboo() {
		final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.peekaboo());

		final int testValue = 123;
		rhymer.countIn(testValue);

		Assert.assertEquals(testValue, rhymer.peekaboo());
		Assert.assertEquals(testValue, rhymer.peekaboo());
	}

	@Test
	public void testCountOut() {
		final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.countOut());

		final int testValue = 123;
		rhymer.countIn(testValue);

		Assert.assertEquals(testValue, rhymer.countOut());
		Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.countOut());
	}
	
	@Test
	public void testTotal() {
		final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int SIZE_ON_INIT = 0;
		final int testValue = 123;
		rhymer.countIn(testValue);

		Assert.assertEquals(SIZE_ON_INIT, rhymer.getTotal());
	}
}
