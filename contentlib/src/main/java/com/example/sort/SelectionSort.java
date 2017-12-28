package com.example.sort;

import static com.example.Utils.t2String;

/**
 * 选择排序
 * Created by y on 2017/12/28.
 */

public class SelectionSort {
    /**
     * 简述
     * 找出未排过序的最大或者最小数，然后放到数组的起始位置。
     * <p>
     * 8  4  7  2  3
     * 第一次{8，4，7，2，3} 中找出最大的8 放于起始位置
     * 找出8 放到第一位
     * 即8  4  7  2  3
     * 第二次{4，7，2，3}中找出最大的7，放于起始位置
     * 接着7  8  4  2  3
     * <p>
     * 。。。
     * <p>
     * 4  7  8  2  3
     * <p>
     * 3  4  7  8  2
     * <p>
     * 2  3  4  7  8
     */


    public static void sort(int[] input) {
        int index = 0;
        int temp = 0;
        for (int i = 0; i < input.length; i++) {
            index = i;
            //找出未排序中最大的数的index
            for (int j = i; j < input.length; j++) {
                if (input[j] > input[index]) {
                    index = j;
                }
            }
            //进行插入，同时位置顺位移动
            temp = input[index];
            for (int x = index; x > 0; x--) {
                input[x] = input[x - 1];
            }
            input[0] = temp;
        }
        System.out.println("Selection result:" + t2String(input));

    }


}
