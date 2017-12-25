package com.example.lee_sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by y on 2017/11/14.
 */

public class FindDuplicates {


    /**
     * Q:    1<= nums[n] <=n  找出重复元素
     * A1:   自己做的话是考虑for双循环，low啊
     *
     * A2：  答案的话 我理解的是翻牌算法，根据(数组的值-1)当做数组下标，
     *       根据这个下标对数组的值取负，判断是否负数，就可以判断值是不是重复
     *       todo 注:遗留问题 当某个值是负数的时候，这时候去的数组下标是 负值-1的绝对值 这里没明白
     *
     */

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                res.add(Math.abs(index + 1));
            }
            nums[index] = -nums[index];
        }
        return res;
    }


}
