package com.example;

import com.example.sort.SelectionSort;
import com.example.sort.ShellSort;

public class MyClass {

    public static void main(String[] args) {
        System.out.println("___");
        int[] ints = {3, 2, 1, 1, 6, 5, 3, 4, 7, 2};
        SelectionSort.sort(ints);
    }

}
