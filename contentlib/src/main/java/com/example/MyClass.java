package com.example;

import com.example.sort.QuickSort;

public class MyClass {

    public static void main(String[] args) {
        System.out.println("___");


        QuickSort quickSort = new QuickSort();
        quickSort.sort(new int[]{5,1,2,3,6,7,8,8,0});
    }

}
