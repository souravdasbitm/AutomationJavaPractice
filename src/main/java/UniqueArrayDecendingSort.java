// Java program to print all distinct
// elements in a given array


import java.util.*;

class UniqueArrayDecendingSort {

    static void printDistinct(Integer[] arr, int n) {
        // Pick all elements one by one
        for (int i = 0; i < n; i++) {
            // Check if the picked element
            // is already printed
            int j;
            for (j = 0; j < i; j++)
                if (arr[i].equals(arr[j]))
                    break;

            // If not printed earlier,
            // then print it
            if (i == j)
                System.out.print(arr[i] + " ");
        }
    }

    // Driver program
    public static void main(String[] args) {
        Integer[] arr = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        int n = arr.length;
        Arrays.sort(arr, Collections.reverseOrder());
        printDistinct(arr, n);

//        List<Integer> list = Arrays.asList(arr);
//        Set<Integer> set = new TreeSet<Integer>(list);
//        // Show Set elements
//        System.out.println("The Set elements are :");
//        for(Integer var : set) {
//            System.out.println(var);
//        }
    }

}

// This code is contributed by vt_m
