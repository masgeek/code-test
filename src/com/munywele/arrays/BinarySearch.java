package com.munywele.arrays;

/**
 * The function takes in an array of integers and an integer to search for. It returns the index of the
 * integer in the array if it is found, otherwise it returns -1
 */
public class BinarySearch {

    /**
     * The function takes in an array of integers and an integer to search for. It returns the index of the
     * integer in the array if it is found, otherwise it returns -1 O(n)
     *
     * @param elements   the array of elements to search through
     * @param theElement the element we are looking for
     * @return The index of the element in the array.
     */
    public int iterative(int[] elements, int theElement) {
        int low = 0;
        int high = elements.length - 1;


        if (high <= 0) {
            return -1;
        }

        //use while loop loop for this one
        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if (elements[mid] == theElement) {
                System.out.println("Mid is " + mid);
                return mid;
            } else if (theElement < elements[mid]) {
                high = mid - 1;
            } else if (theElement > elements[mid]) {
                low = mid + 1;
            }
        }

        return -1;
    }

    /**
     * If the element is not in the array, return -1. Otherwise, find the middle of the array, and if the
     * element is less than the middle, recursively call the function on the lower half of the array.
     * Otherwise, recursively call the function on the upper half of the array O(log n)
     *
     * @param elements   the array of elements to search through
     * @param theElement the element we are looking for
     * @param low        the lowest index of the array we're searching
     * @param high       the highest index of the array
     */
    public int recursive(int[] elements, int theElement, int low, int high) {
        if (low > high) {
            System.out.print("Exceeded");
            return -1;
        }

        //find the flow
        int mid = low + ((high - low) / 2);


        if (elements[mid] == theElement) {
            return mid;
        }

        if (theElement < elements[mid]) {
            return recursive(elements, theElement, low, mid - 1);
        }

        if (theElement > elements[mid]) {
            return recursive(elements, theElement, mid + 1, high);
        }

        return -1;
    }
}
