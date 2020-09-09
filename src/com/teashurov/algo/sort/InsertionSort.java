package com.teashurov.algo.sort;

import com.teashurov.algo.commons.Printer;
/*
*
*   it shifts elements
* */
public class InsertionSort {
    public void sort() {
        int[] intArray = {1, 54, 2, 4, 5, 7, 1, -1, -30};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }
        Printer.printObj(intArray);
    }
}
