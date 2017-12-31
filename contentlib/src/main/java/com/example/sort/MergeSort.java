package com.example.sort;

import static com.example.Utils.t2String;

/**
 * 归并排序
 * Created by y on 2017/12/30.
 */

public class MergeSort {
    /**
     * 归并排序算法
     * 核心思想就是量数组，分别去一个数进行比较，然后归入新的数组中去。
     * 直到其中一个数组的长度为0时，另一个数组就可以直接并入新数组中。（前提：这两个数组都是有序的）
     * <p>
     * eg
     * 3  5  7  8  2  4
     * 先拆分成最小数组即
     * {3  5} {7 8} {2 4}
     * 进行排序
     * {3  5} {7  8} {2  4}
     * 接着去{3  5} {7 8} 出来，分别取出数组的首位数3  7 进行比较，3小于7 ，3放在新数组的第一个位置。
     * 接着取 5  和 7 进行比较。5小于 7 ，5接着放入新数组中。此时，第一个数组已经空了，所以，第二个数组能够直接并入新数组中。
     * 得
     * {3 5 7 8} 。
     * 由于数组{2  4} 没有可比较的数组，即跳过。
     * <p>
     * 接着取数组{3  5  7  8} 和数组 {2  4} 进行比较。分别取 3  2 ，2 进入新数组中。
     * 接着 3 和4 比较，3进入新数组中。
     * 接着5 和4 比较，4进入新数组中。
     * 此时，数组{2  4} 已经没有剩余元素了。所以第一个数组剩余的元素直接并入新数组中。
     * 最终得到结果为
     * 2 3 4  5 7 8
     * 排序完毕
     */


    public static void sort(int[] input) {

        int temp = -1;

        //第一步，拆分成长度为2的最小数组，并排序
        for (int i = 0; i < input.length; i = i + 2) {
            if (input[i] > input[i + 1]) {
                temp = input[i];
                input[i] = input[i + 1];
                input[i + 1] = temp;

            }
        }
        System.out.println("MergeSort result:" + t2String(input));

        //取相邻的两组数组进行比较合并。因为最小数组长度为2，所以
        int perSize = 2;
        int index1 = 0;
        int index2 = 0;
        //用于临时数组的下标
        int index = 0;
        int[] tempArray = new int[input.length];
        while (perSize * 2 < input.length*2) {
//            for (int i = 0; i < input.length; i = i + perSize * 2) {
            for (int i = 0; i < input.length; i = i + perSize * 2) {
                index1 = i;
                index2 = i + perSize;


                index = i;
                //两个数组比较的次数
                for (int j = 0; j < perSize * 2; j++) {

                    //第一个数组为空
                    if (index1 >= i + perSize) {
                        for (int x = index2; x < i + perSize * 2; x++) {
                            System.out.println("index :" + index);
                            System.out.println("x :" + x);
                            if (x < input.length) {
                                tempArray[index] = input[x];
                                index++;
                            }
                        }
                        break;

                    }

                    //第二个数组为空
                    if (index2 >= input.length || index2 >= i + perSize * 2) {
                        for (int y = index1; y < i + perSize; y++) {
                            if (y < input.length) {
                                tempArray[index] = input[y];
                                index++;
                            }
                        }
                        break;


                    }
                    if (input[index1] < input[index2]) {
                        tempArray[index] = input[index1];
                        index++;
                        index1++;
                    } else {
                        tempArray[index] = input[index2];
                        index++;
                        index2++;
                    }


                }
            }
            input = tempArray.clone();

            perSize = perSize * 2;
        }
        System.out.println("MergeSort result:" + t2String(input));

    }

    /**
     *
     *  4 5  6 7        1  2  3  4
     *
     *
     */

    /**
     * 3 4 5 3     2 4 1
     */


}
