package com.teashurov.algo.sort;

import com.teashurov.algo.commons.Printer;
import com.teashurov.algo.commons.Swapper;

/*
 * O(n2) time complexity quadratic
 * In our case, larger number will bubble to end of the array in each unsorted iteration
 * stable
 * */
public class BubbleSort extends Swapper {
    public void sort() {
        int[] intArray = {1, 54, 2, 4, 5, 7, 1, -1, -30};

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }
        Printer.printObj(intArray);
    }


}
