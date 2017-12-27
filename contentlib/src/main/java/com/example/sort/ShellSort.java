package com.example.sort;

import static com.example.Utils.t2String;

/**
 * 希尔排序
 * Created by y on 2017/12/27.
 */

public class ShellSort {

    /**
     * 说说希尔排序，理解还不够透彻
     * 增量型，分组比较，插入排序算法
     * <p>
     * 暂时先不考虑最优步长，直接粗暴的来，就取2
     * <p>
     * 8  9  3  7  3  2  4  3  1
     * <p>
     * length/2 获得步长是 4 获得数组集合
     * 8  9  3  7  3  2  4  3  1
     * a1          a2          a3     ==>{8,3,1}  排序  1 3 8
     * b1          b2              ==>{9,2}    排序  2 9
     * c1          c2           ==> {3,4}   排序  3 4
     * d1         d2         ==>{7,3}    排序  3 7
     * 第一次排序后
     * 1  2  3  3  3  9   4 7  8
     * <p>
     * <p>
     * 接着继续 步长减小，拆分数组加长
     * length/2/2  步长2
     * 1  2  3  3  3  9  4  7  8
     * a1   a2     a3    a4    a5    ==>{1,3,3,4,8} 排序 1 3 3 4 8
     * b1     b3    b3   b4        ==>{2,3,9,7}  排序   2 3 7 9
     * <p>
     * 第二次排序后
     * 1  2  3  3  3  7  4  9  8
     * <p>
     * continue  步长减小
     * 步长1 直接插入排序
     */

    public static void shellSort(int[] input, int vars) {
        System.out.println("shellSort result:" + t2String(input));

        int interval = input.length / vars;
        while (interval >= 1) {
            for (int i = 0; i < interval; i++) {
                for (int j = i; j < input.length; j += interval) {
                    //开始进行插入排序
                    if (j > i) {
                        for (int x = i; x < j; x += interval) {
                            if (input[x] > input[j]) {
                                int temp = input[j];
                                for (int h = j; h > x; h -= interval) {
                                    input[h] = input[h - interval];
                                }
                                input[x] = temp;
                                break;
                            }
                        }
                    }
                }
                System.out.println();

            }
            interval = interval / vars;
            System.out.println();


        }
        System.out.println("shellSort result:" + t2String(input));


    }


}
