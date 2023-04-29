package telran.algorithm;

public class InitialAlgorithms {

	public static void sortShortPositive(short[] array) {
		int[] helper = new int[Short.MAX_VALUE];
		for (int i = 0; i < array.length; i++) {
			helper[array[i]]++;
		}
		int ind = 0;
		for (int i = 0; i < helper.length; i++) {
			for (int j = 0; j < helper[i]; j++) {
				array[ind++] = (short) i;
			}
		}

	}

	public static boolean isSum2(short[] array, short sum) {
		bubbleSort(array);
		boolean res = false;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == sum) {
					res = true;
				}
			}
		}
		return res;
	}

	public static short getMaxPositiveWithNegativeReflect(short[] array) {
		bubbleSort(array);
		short res = -1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i]*-1 == array[j]) {
					res = array[i];
				}
			}
		}
		return res;
	}

	public static void bubbleSort(short[] array) {
		boolean sortArray = false;
		int tmp;
		while (!sortArray) {
			sortArray = true;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					sortArray = false;
					tmp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = (short) tmp;
				}
			}
		}
	}

}
