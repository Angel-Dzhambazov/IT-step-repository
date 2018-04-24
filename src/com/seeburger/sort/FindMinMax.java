package com.seeburger.sort;

import java.util.Random;

public class FindMinMax {
	int[] array;
	int min;
	int max;

	public FindMinMax(int size) {
		this.setArray(size);
		this.getMinMax();
		this.bubbleSort();
	}

	private void getMinMax() {
		int min = this.array[0];
		int max = this.array[0];
		for (int i = 1; i < this.array.length; i++) {
			if (this.array[i] < min) {
				min = this.array[i];
			}
			if (this.array[i] > max) {
				max = this.array[i];
			}
		}
		this.min = min;
		this.max = max;
		// return String.format("The MINIMUM element in the randomly generated
		// array is: %d", min);
	}

	private void setArray(int size) {
		Random random = new Random(System.currentTimeMillis());
		this.array = new int[size];
		while (size > 0) {
			int j = random.nextInt(1000);
			array[size - 1] = j;
			size--;
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i : this.array) {
			sb.append(String.format("%d ", i));
		}
		sb.append(System.lineSeparator())
				.append(String.format("The MINIMUM element in the randomly generated array is: %d", this.min));
		sb.append(System.lineSeparator())
				.append(String.format("The MAXIMUM element in the randomly generated array is: %d", this.max));
		return sb.toString().trim();
	}

	private void bubbleSort() {
		int size = this.array.length;
		for (int i = 0; i < size; i++) {
			for (int j = 1; j < size - i; j++) {
				int temp = 0;
				int leftElement = this.array[j - 1];
				int rightElement = this.array[j];
				if (leftElement > rightElement) {
					temp = rightElement;
					this.array[j] = leftElement;
					this.array[j - 1] = temp;
				}
			}
		}
	}
}
