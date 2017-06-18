package com.example;

import static com.example.Utils.t2String;

/**
 * Created by y on 2017/6/19.
 */

public class BubbleSort {


    public void sort(int[] input) {
        System.out.println("bubblesort  input:" + t2String(input));

        int temp = 0;
        for (int i = 0; i < input.length; i++) {

            for (int j = 0; j < (input.length - 1); j++) {
                if (input[j] > input[j + 1]) {
                    temp = input[j + 1];
                    input[j + 1] = input[j];
                    input[j] = temp;

                }


            }
        }

        System.out.println("bubblesort resutl:" + t2String(input));


    }





}
