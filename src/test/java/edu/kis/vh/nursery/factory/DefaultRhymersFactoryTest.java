package edu.kis.vh.nursery.factory;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class DefaultRhymersFactoryTest {

	@Test
	public void testGetStandardRhymer() {
		final DefaultRhymersFactory factory = new DefaultRhymersFactory();
		assertNotNull(factory.getStandardRhymer());
	}

	@Test
	public void testGetFalseRhymer() {
		final DefaultRhymersFactory factory = new DefaultRhymersFactory();
		assertNotNull(factory.getFalseRhymer());
	}

	@Test
	public void testGetFIFORhymer() {
		final DefaultRhymersFactory factory = new DefaultRhymersFactory();
		assertNotNull(factory.getFIFORhymer());
	}

	@Test
	public void testGetHanoiRhymer() {
		final DefaultRhymersFactory factory = new DefaultRhymersFactory();
		assertNotNull(factory.getHanoiRhymer());
	}
}
