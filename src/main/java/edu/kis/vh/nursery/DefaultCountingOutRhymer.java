package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int TOTAL_FULL = 11;

	public static final int TOTAL_INIT = -1;

	private static final int ARRAY_SIZE = 12;

	private final int[] numbers = new int[ARRAY_SIZE];

	public int total = TOTAL_INIT;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == TOTAL_INIT;
	}

	public boolean isFull() {
		return total == TOTAL_FULL;
	}

	protected int peekaboo() {
		if (callCheck())
			return TOTAL_INIT;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return TOTAL_INIT;
		return numbers[total--];
	}

}
