package com.example.lee_sort;

/**
 * Created by y on 2017/11/16.
 */

public class xx {

    public static  int[] constructArray(int n, int k) {

        int [] result = new int[n];
        int kk =k;
        result[0] =1;
        int index2 =1+k;
        int start =1;
        for(int i =1;i<(n+1);i++){
            if(index2 >= i){
                result[i-1] =i;
            }else{
                result[i-1] =((start-k)>1)?i+k:k-i;
            }

        }
        for(int a:result){
            System.out.print(a+"_");

        }

        return result;
    }

}
