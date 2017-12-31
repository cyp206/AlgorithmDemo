package com.example.sort;

import static com.example.Utils.t2String;

/**
 * 基数排序
 * ed by y on 2017/12/31.
 */

public class RadixSort {
    /**
     *
     * url:http://blog.csdn.net/lemon_tree12138/article/details/51695211
     * 基数排序思想==》大表、或者映射思想。类似的有 hash数组。
     *改排序思想比较特殊，不需要进行大小比较。个人理解为位数匹配
     * eg：23  465  3  8792  34  23
     * 首先，我们创建10个桶，编号分别是[0-9]，对应的是每一个元素个位上的每一种可能。值相同的，放入相同的桶中。
     *      第一次排序
     * 0==> null       ==>3         ==>3、23、23、34
     * 1==> null       ==>          ==>
     * 2==> 8792       ==>23、23    ==>
     * 3==> 23、23、3   ==>34        ==>
     * 4==> 34         ==>          ==>465
     * 5==> 465        ==>          ==>
     * 6==> null       ==>465       ==>
     * 7==> null       ==>          ==>
     * 8==> null       ==>          ==>892
     * 9==> null       ==>892       ==>
     *
     *
     *即数组最终顺序为
     * 3、23、23、34、465、892
     *
     *
     *
     *
     */


    /**
     * 按照分桶思想，每次排序需要建立10*array.length个数组，空间利用率极低。
     * 这里取巧，使用两个临时数组代替。
     */
    public static void sort(int[] input) {
        boolean flag = true;
        int[] tempArray = new int[input.length];
        int index = 0;
        int place = 1; //个位开始
        while (flag) {

            index = 0;

            //10个桶用来赛选
            for (int i = 0; i <= 9; i++) {
                //每个桶进行赛选
                for (int j = 0; j < input.length; j++) {
                    int p = getPlace(input[j], place);
                    if (p == i) {
                        tempArray[index] = input[j];
                        index++;
                    }
                }

                //当前比较的位数大于数组里所有元素，同时也说明该排序已经排序好了。跳出循环。
                if (i == 0 && index == input.length ) {
                    flag = false;
                    break;

                }

            }
            place++;
            input = tempArray.clone();
        }

        System.out.println("RadixSort result:" + t2String(input));


    }


    /**
     * 获得数位
     *
     * @param var   数
     * @param place 对应位数
     * @return
     */
    public static int getPlace(int var, int place) {
        String s = String.valueOf(var);
        return (place > s.length()) ? 0 : Character.getNumericValue(s.charAt(place - 1));
    }


    /**
     * tips
     *
     * 获得对应位数  如 234 分别获得 2 3  4
     *
     * 这里采用string转换获得对应位数
     *
     *
     */


    /**
     *
     * 两个地方被坑了
     * 第一个 char 对应的是 ascll  码，由对应的码和值组成，需要通过 Character.getNumericValue转换
     *
     * 第二个 还是边界问题
     */


}
