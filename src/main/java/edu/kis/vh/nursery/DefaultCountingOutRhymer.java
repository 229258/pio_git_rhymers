package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int TOTAL_FULL = 11;
	private static final int TOTAL_INIT = -1;
	private static final int ARRAY_SIZE = 12;
	private final int[] numbers = new int[ARRAY_SIZE];

	private int total = TOTAL_INIT;

	public int getTotal() {
		return total;
	}

	protected void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	protected boolean callCheck() {
		return total == TOTAL_INIT;
	}

	protected boolean isFull() {
		return total == TOTAL_FULL;
	}

	protected int peekaboo() {
		if (callCheck())
			return TOTAL_INIT;
		return numbers[total];
	}

	protected int countOut() {
		if (callCheck())
			return TOTAL_INIT;
		return numbers[total--];
	}
}
