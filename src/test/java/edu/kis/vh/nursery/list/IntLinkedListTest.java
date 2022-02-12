package edu.kis.vh.nursery.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class IntLinkedListTest {

	@Test
	public void testPush() {
		final IntLinkedList intLinkedList = new IntLinkedList();
		final int testValue = 123;

		intLinkedList.push(testValue);
		assertEquals(testValue, intLinkedList.top());
	}

	@Test
	public void testIsEmpty() {
		final IntLinkedList intLinkedList = new IntLinkedList();
		assertTrue(intLinkedList.isEmpty());
	}

	@Test
	public void testIsFull() {
		final IntLinkedList intLinkedList = new IntLinkedList();
		assertFalse(intLinkedList.isFull());
	}

	@Test
	public void testTop() {
		final IntLinkedList intLinkedList = new IntLinkedList();
		final int testValue = 123;
		
		intLinkedList.push(testValue);
		assertEquals(testValue, intLinkedList.top());
	}
	
	@Test
	public void testTopWhenEmpty() {
		final IntLinkedList intLinkedList = new IntLinkedList();
		final int testValueWhenEmpty = -1;
		assertEquals(testValueWhenEmpty, intLinkedList.top());
	}

	@Test
	public void testPop() {
		final IntLinkedList intLinkedList = new IntLinkedList();
		final int testValue = 123;
		
		intLinkedList.push(testValue);
		assertEquals(testValue, intLinkedList.pop());
	}
	
	@Test
	public void testPopWhenEmpty() {
		final IntLinkedList intLinkedList = new IntLinkedList();
		final int testValueWhenEmpty = -1;
		
		assertEquals(testValueWhenEmpty, intLinkedList.pop());
	}
}
