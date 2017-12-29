package com.example.sort;

import static com.example.Utils.t2String;

/**
 * 堆排序
 * Created by y on 2017/12/29.
 */

public class HeapSort {


    /**
     * 将一维数组构建成完全二叉树
     * 根据 array[i] >array[2i]&&array[i] >array[2i+1]  ==>父节点为最大数  (i =数组长度 /2)
     * 反之 array[i] <array[2i]&&array[i] <array[2i+1]  ==>父节点为最小数 (i =数组长度 /2)
     * eg:
     * 原数组  4 7 6 2 9 6
     * 构建二叉树
     * 4
     * 7        6
     * 2    9   6
     * <p>
     * i从array.length /2 开始，定位在了6
     * 下标i=3 和i=6 的数组进行比较，因为不满足 array[3] < array[6],不变。
     * 接着继续
     * i--; i=2;定位到了7
     * 下标i=2和 i =4 和i=5进行比较，7 < 9,互换位置。
     * 此时的二叉树
     * 4
     * 9      6
     * 2  7  6
     * go on
     * i--;i=1;定位到4
     * 最终得到二叉树
     * 9
     * 4       6
     * 2    7 6
     * <p>
     * 取出9，跟最末尾的数换位。
     * 由于已近定位了到了最大数，并且将它放大了它对应的位置。这个时候，二叉树减少一个，并且需要重新构建二叉树。
     * 此时的二叉树应该是
     * 6
     * 4        6
     * 2   7
     * <p>
     * 排序后
     * 7
     * 6         6
     * 2    4
     * <p>
     * 取走7再来
     * 4
     * 6           6
     * 2
     * 排序后
     * 6
     * 4       6
     * 2
     * 取走6再排
     * 2
     * 4   6
     * 排序后
     * 6
     * 2     4
     * <p>
     * 取走6再排
     * 4
     * 2
     * 取走4，完成排序
     * <p>
     * 最终
     * 2 4 6  6 7  9
     */


    public static void sort(int[] input) {
        int temp = -1;
        int child1 = -1;
        int child2 = -1;
        int parent = -1;
        for (int i = input.length - 1; i > 0; i--) {
            //i的定义是 定位i对应的元素

            //构建符合要求的完全二叉树,二叉树的其实坐标为1，数组其实坐标为0.需要注意。
            for (int j = (i + 1) / 2; j > 0; j--) {
                parent = j - 1;
                child1 = j * 2 - 1;
                child2 = j * 2;
                if (child1 <= i && input[parent] < input[child1]) {
                    temp = input[parent];
                    input[parent] = input[child1];
                    input[child1] = temp;
                }
                if (child2 <= i && input[parent] < input[child2]) {
                    temp = input[parent];
                    input[parent] = input[child2];
                    input[child2] = temp;
                }
            }
            //排序完毕,取最大节点数与i换位
            temp = input[0];
            input[0] = input[i];
            input[i] = temp;
        }

        System.out.println("HeapSort result:" + t2String(input));



    }


    /**      0
     *    1     2
     * 3   4  5   6
     */


}
