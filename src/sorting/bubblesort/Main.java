package sorting.bubblesort;

/*
- A simple comparison-based algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them
if they are in the wrong order.This process is repeated until the list is sorted.

- In Bubble Sort, adjacent elements are compared and swapped if they are in the wrong order.
This process is repeated until no swaps are needed, indicating that the list is sorted.
*/
public class Main {
    // Method to perform bubble sort on an array
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        // Outer loop for each pass
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap if elements are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no elements were swapped, the array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Unsorted array:");
        printArray(array);

        bubbleSort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }
}
