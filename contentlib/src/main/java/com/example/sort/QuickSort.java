package com.example.sort;

import static com.example.Utils.t2String;

/**
 * Created by y on 2017/6/19.
 */

public class QuickSort {
    /**
     * 快速排序的原理
     * <p>
     * 找一基数（一般而言，数组第一个），通过跟这个基数进行比较（从头开始，和从末尾开始），纠正数组中大于基数却放在了基数最终位置左边的数。反之小于基数最终位置而放于基数右边的数，
     * 通过对这两个数进行交换，一是纠正了排序，二是定位了基数的最终位置。
     * <p>
     * eg：
     * <p>
     * 4 8 9 3 2 6 2 4
     * <p>
     * 选4最为基数，从末尾开始找到 小于4的数。找到4下标为7，接着从其实开始，找到8下标为2，然后二者互换。
     * <p>
     * 4 4 9 3 2 6 2 8
     * <p>
     * 接着继续找
     * <p>
     * 末尾找到2下标6，起始找到9下标为2。二者互换
     * <p>
     * 4 4 2 3 2 6 9 8
     * <p>
     * recycle
     * <p>
     * 继续末尾 找到2 下标4，起始 6 下标5，这时候说明位置已经找好了，选5-1=4，所以4更2换
     * 2 4 2 3 4 6 9 8
     * <p>
     * 接着基数为2，开始做循环
     * <p>
     * 2 只找到了2下标是2，即 i=0,j=2,这时候不作操作。
     * <p>
     * 接着基数位置由0开始变成了1，几4开始操作。
     * 末尾找到4 起始2 互换之
     * <p>
     * 2 4 4 3 2 6 9 8
     * <p>
     * 2 2 4 3 4 6 9 8
     * <p>
     * 基数为2 过
     * 基数为4
     * <p>
     * 2 2 3 4 4 6 9 8
     * 基数为3 过
     * 基数为4 过
     * 基数为4 过
     * 基数为6 过
     * 基数为9
     * 2 2 3 4 4 6 8 9
     *
     * @param input
     */

    public static void QuickSort(int[] input) {

        int index = 0;//切割点下标,当切割点下标==size-1时候，结束循环。
        int i, j = 0; //起始和结束位置下标
        int temp = 0;
        while (index < input.length - 1) {
            i = -1;
            j = -1;
            for (int y = input.length - 1; y > index; y--) {
                if (input[index] > input[y]) {
                    j = y;
                    break;
                }

            }

            //从右往左遍历没有找到小于切割点的数，说明切割点位置正确。
            if (j == -1) {
                index++;
                continue;
            }

            //从左遍历
            for (int x = index + 1; x < input.length - 1; x++) {
                if (input[index] < input[x]) {
                    i = x;
                    break;
                }
            }
            if(i ==-1){
                temp =input[index];
                input[index] =input[j];
                input[j]=temp;
                continue;

            }


            if (i > j) {
                temp = input[index];
                input[index] = input[Math.min(i, j)];
                input[Math.min(i, j)] = temp;
            } else if (i < j) {
                temp = input[i];
                input[i] = input[j];
                input[j] = temp;

            }


        }
        System.out.println("QuickSort resutl:" + t2String(input));
    }


    /**直接结论
     * 1、末尾找小数，无==index++
     * 2、起始找大叔，无==切割点和最后点换位
     * 3、找到结果数
     *  3.1  起始下标会大于末尾下标，即array[j] <array[i],说明位置正确，切割点直接跟array[j]互换
     *  3.2  起始下标小于末尾下标，即array[i]<array[j],说明位置不正确，i ,j 互换
     *
     *
     * @param input
     */



    //todo 优化，同时学习别人的算法。


}


