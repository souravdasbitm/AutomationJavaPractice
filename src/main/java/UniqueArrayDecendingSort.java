// Java program to print all distinct
// elements in a given array
import java.io.*;
import java.util.Arrays;
import java.util.Collections;

class UniqueArrayDecendingSort {

    static void printDistinct(Integer[] arr, int n)
    {
        // Pick all elements one by one
        for (int i = 0; i < n; i++)
        {
            // Check if the picked element
            // is already printed
            int j;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;

            // If not printed earlier,
            // then print it
            if (i == j)
                System.out.print( arr[i] + " ");
        }
    }

    // Driver program
    public static void main (String[] args)
    {
        Integer[] arr = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        int n = arr.length;
        Arrays.sort(arr, Collections.reverseOrder());
        printDistinct(arr, n);

    }
}

// This code is contributed by vt_m
