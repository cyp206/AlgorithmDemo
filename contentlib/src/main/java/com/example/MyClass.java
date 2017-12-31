package com.example;

import com.example.sort.HeapSort;
import com.example.sort.MergeSort;
import com.example.sort.RadixSort;

import static com.example.Utils.t2String;

public class MyClass {

    public static void main(String[] args) {
        System.out.println("___");
        int[] input = {3, 2, 1, 1, 6, 5, 3, 4, 7, 2};
        System.out.println("input:" + t2String(input));

        RadixSort.sort(input);
    }

}
