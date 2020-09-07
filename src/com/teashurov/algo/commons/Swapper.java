package com.teashurov.algo.commons;

public class Swapper {
    public void swap(int[] array, int i, int j) {
        if (i == j)
            return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
