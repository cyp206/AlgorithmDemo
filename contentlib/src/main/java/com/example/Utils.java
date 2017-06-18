package com.example;

/**
 * Created by y on 2017/6/19.
 */

public class Utils {
    public static StringBuffer t2String(int[] ints) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int a : ints) {
            stringBuffer.append(a + "、");
        }
        return stringBuffer;

    }
}
