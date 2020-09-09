package com.teashurov.algo.sort;

import com.teashurov.algo.commons.Printer;
import com.teashurov.algo.commons.Swapper;

/*
* O(n2) time complexity quadratic
* Divides array to sorted and unsorted partitions
* looks largest element and swaps it
* unstable
*  */
public class SelectionSort extends Swapper {
    public void sort() {
        int[] intArray = {1, 54, 2, 4, 5, 7, 1, -1, -30};

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 0; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }
            swap(intArray, largest, lastUnsortedIndex);
        }
        Printer.printObj(intArray);
    }
}
