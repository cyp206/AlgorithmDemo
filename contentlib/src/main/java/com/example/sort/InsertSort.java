package com.example.sort;

import static com.example.Utils.t2String;

/**
 * Created by y on 2017/12/26.
 * <p>
 * 插入排序算法
 */

public class InsertSort {


    /**
     * 原理
     * 反逆序操作，即保证区间[0，i]（ i为当前的取出比较数字的下标）的排序是正确的
     * 4 8 2 3 1
     * 第一次取 4  区间为[0,0] 跳过
     * 第二次取 8  区间为[0,1] 得到  4  8 2 3 1
     * 第三次取 2  区间[0，2] 得到  2 4 8 3 1
     * 。。。。
     * 1 2 3 4 8
     */

    public static void srot(int[] input) {

        for (int i = 1; i < input.length; i++) {
            int temp = -1;
            int temp1 = -1;
            for (int j = 0; j < i; j++) {
                //找到自己的位置
                if (input[j] > input[i]) {
                    temp = input[j];
                    input[j] = input[i];
                    //接下来进行移位操作
                    for (int k = j + 1; k <= i; k++) {
                        temp1 = input[k];
                        input[k] = temp;
                        temp = temp1;
                    }
                    break;
                }

            }



        }

        System.out.println("InsertSort resutl:" + t2String(input));

    }


    /**
     * 找位置，然后插入，看是否区间末尾，不是则进行数组位移
     */
}
