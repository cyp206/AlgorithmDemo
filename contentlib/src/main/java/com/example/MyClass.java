package com.example;

import com.example.sort.FindDuplicates;
import com.example.sort.QuickSort;

import java.util.List;

public class MyClass {

    public static void main(String[] args) {
        System.out.println("___");


//        QuickSort quickSort = new QuickSort();
//        quickSort.sort(new int[]{5,1,2,3,6,7,8,8,0});
        int[] ints = {5,2,2,3,5};
//        int[] ints = {5, 1, 2, 3, 6, 7, 5, 1, 2};
        System.out.println( "{5, 1, 2, 3, 6, 7, 5, 1, 2}");

        List<Integer> duplicates = FindDuplicates.findDuplicates(ints);
      System.out.print(  duplicates.toString());
    }


    /**
     *
     *
     * 5,2,2,3,5
     *         -5
     *   -2
     *   2              2
     *      -2
     *
     *
     *
     */
}
