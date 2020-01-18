package com.anderfred;

public class BubbleSort {
    int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }

    public int[] sort() {
        for (int i = 0; i < array.length; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    array[j] = array[j] + array[j + 1];
                    array[j + 1] = array[j] - array[j + 1];
                    array[j] = array[j] - array[j + 1];
                    isSwapped = true;
                }
            }
            System.out.print(" i = " + i);
            for (int k : array) System.out.print(" " + k);
            System.out.println();
            if (!isSwapped) break;
        }
        return array;
    }
}
