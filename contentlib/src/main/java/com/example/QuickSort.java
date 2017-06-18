package com.example;

import static com.example.Utils.t2String;

/**
 * Created by y on 2017/6/19.
 */

public class QuickSort {
    //todo  利用下标 当做指针 进行位置替换

    public void sort(int[] input) {


        System.out.println("QuickSort  input:" + t2String(input));

        int povIndex = 0;

        for (int i = 0; i < (input.length - 1); i++) {
            int temtvalue = input[povIndex];
            if (temtvalue > input[i + 1]) {
                input[povIndex] = input[i + 1];
                input[i + 1] = temtvalue;
                povIndex = i + 1;
            }


//            if (temtvalue >)

        }


        System.out.println("QuickSort resutl:" + t2String(input));


    }


    public int ss(int[] s, int l, int h) {

//        int tem


        return 0;

    }

}


