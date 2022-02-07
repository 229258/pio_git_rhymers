package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int VALUE_FOR_EMPTY_LIST = -1;
	private Node last;
	private int i;

	private void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	private boolean isEmpty() {
		return last == null;
	}

	private boolean isFull() {
		return false;
	}

	private int top() {
		if (isEmpty())
			return VALUE_FOR_EMPTY_LIST;
		return last.getValue();
	}

	private int pop() {
		if (isEmpty())
			return VALUE_FOR_EMPTY_LIST;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	Node getLast() {
		return last;
	}

	int getI() {
		return i;
	}
}
