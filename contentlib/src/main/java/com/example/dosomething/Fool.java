package com.example.dosomething;

/**
 * Created by y on 2017/11/23.
 */

public class Fool {

    public static void foo() {
        int a = 0x30;
        int b = 0 << 30;
        System.out.println(b);
        for (int i = 0; i < 30; i++) {
            System.out.println(i << 30);

        }


    }

}
