package telran.util.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.util.ArrayList;

class ArrayListTest {
	ArrayList<Integer> numbers = new ArrayList<>();

	@Test
	void testAdd() {
		ArrayList<String> strings = new ArrayList<>();
		numbers.add(5);
		numbers.add(10);
		strings.add("abs");
		assertEquals(2, numbers.size());
		assertEquals(1, strings.size());

	}

	@Test
	void testAddIndex() {
		for (int i = 0; i < 5; i++) {
			numbers.add(i);
		}
		numbers.add(0, 10);
		assertEquals(6, numbers.size());
		assertEquals(10, numbers.get(0));
		assertEquals(0, numbers.get(1));
		numbers.add(3, 15);
		assertEquals(7, numbers.size());
		assertEquals(15, numbers.get(3));
		assertEquals(2, numbers.get(4));
		numbers.add(7, 9);
		assertEquals(8, numbers.size());
		assertEquals(9, numbers.get(7));
		assertEquals(4, numbers.get(6));

	}

	@Test
	void testRemoveIndex() {
		for (int i = 0; i < 10; i++) {
			numbers.add(i);
		}
		assertEquals(0, numbers.remove(0));
		assertEquals(9, numbers.size());
		assertEquals(1, numbers.get(0));
		assertEquals(5, numbers.remove(4));
		assertEquals(8, numbers.size());
		assertEquals(6, numbers.get(4));
		assertEquals(9, numbers.remove(7));
		assertEquals(7, numbers.size());
		assertEquals(8, numbers.get(6));

	}
}
