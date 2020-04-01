package com.codetail.train.algo;

public class BubbleSort {

    public static int[] sort(int[] unsortArray){

        for (int i = 0; i < unsortArray.length -1; i++){
            for(int j = 0; j < unsortArray.length - 1 - i; j++){
                if(unsortArray[j] > unsortArray[j+1])
                {
                    int tmp = unsortArray[j];
                    unsortArray[j] = unsortArray[j+1];
                    unsortArray[j+1] = tmp;
                }
            }

        }

        return unsortArray;
    }

}
