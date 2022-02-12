package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.RhymersFactory;

/**
 * The factory class implements RhymersFactory and creates
 * DefaultCountingOutRhymer objects of different types
 * 
 * @author Wojciech Grzybek
 * @see RhymersFactory
 * @see DefaultCountingOutRhymer
 */
public class DefaultRhymersFactory implements RhymersFactory {

	/**
	 * Creates a DefaultCountingOutRhymer object
	 *
	 * @return DefaultCountingOutRhymer object
	 * @see DefaultCountingOutRhymer
	 */
	@Override
	public DefaultCountingOutRhymer getStandardRhymer() {
		return new DefaultCountingOutRhymer();
	}

	/**
	 * Creates a DefaultCountingOutRhymer object
	 *
	 * @return DefaultCountingOutRhymer object
	 * @see DefaultCountingOutRhymer
	 */
	@Override
	public DefaultCountingOutRhymer getFalseRhymer() {
		return new DefaultCountingOutRhymer();
	}

	/**
	 * Creates a FIFORhymer object
	 *
	 * @return FIFORhymer object
	 * @see FIFORhymer
	 */
	@Override
	public DefaultCountingOutRhymer getFIFORhymer() {
		return new FIFORhymer();
	}

	/**
	 * Creates a HanoiRhymer object
	 *
	 * @return HanoiRhymer object
	 * @see HanoiRhymer
	 */
	@Override
	public DefaultCountingOutRhymer getHanoiRhymer() {
		return new HanoiRhymer();
	}
}
