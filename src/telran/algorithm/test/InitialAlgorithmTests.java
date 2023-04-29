package telran.algorithm.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static telran.algorithm.InitialAlgorithms.*;

class InitialAlgorithmTests {
	short[] array = new short[100000];

	@BeforeEach
	void setUp() {
		for (int i = 0; i < array.length; i++) {
			array[i] = (short) (Math.random() * Short.MAX_VALUE);
		}
	}

	private boolean runSortedArrayTest(short[] array) {
		boolean res = true;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					return false;
				}
			}
		}
		return res;
	}

	@Test
	void testSortShortPositive() {
		sortShortPositive(array);
		assertTrue(runSortedArrayTest(array));
	}

	@Test
	void testIsSum2() {
		short[] testArray = { 9, -4, 1, -3, -7, -6, 10 };
		short sum = 5;
		short sum1 = -1;
		assertTrue(isSum2(testArray, sum));
		assertFalse(isSum2(testArray, sum1));
	}

	@Test
	void testGetMaxPositiveWithNegativeReflect() {
		short[] test = { 15, 22, 6, -2, 5, 6, 2, -9, -12, 0, -8, 8 };
		short[] test1 = { 22, -1, -9, -5, -8, 3, 3, 3 };
		assertEquals(8, getMaxPositiveWithNegativeReflect(test));
		assertEquals(-1, getMaxPositiveWithNegativeReflect(test1));

	}

	@Test
	void testBubbleSort() {
		bubbleSort(array);
		assertTrue(runSortedArrayTest(array));
	}

}
