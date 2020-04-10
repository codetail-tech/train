package com.codetail.train.algo;

import java.util.Arrays;

public class MergeSort {

    public static int[] sort(int[] unSortedArr){

        return divSort(unSortedArr);

    }

    private static int[] divSort(int[] arr){
        if(arr.length < 2){
            return arr;
        }

        int mid = arr.length/2;

        int[] arrLeft = Arrays.copyOfRange(arr, 0, mid);
        int[] arrRight = Arrays.copyOfRange(arr, mid, arr.length);

        return mergeTwoSortedArray(divSort(arrLeft), divSort(arrRight));
    }

    private static int[] mergeTwoSortedArray(int[] arrLeft, int[] arrRight){
        int[] arrMerged = new int[arrLeft.length + arrRight.length];

        int idxLeft =0, idxRight = 0;

        while(idxLeft < arrLeft.length && idxRight < arrRight.length){

            if(arrLeft[idxLeft] < arrRight[idxRight]){
                arrMerged[idxLeft + idxRight] = arrLeft[idxLeft];
                idxLeft++;
            }
            else {
                arrMerged[idxLeft + idxRight] = arrRight[idxRight];
                idxRight++;
            }

        }

        while (idxLeft < arrLeft.length){
            arrMerged[idxLeft + idxRight] = arrLeft[idxLeft];
            idxLeft++;
        }

        while (idxRight < arrRight.length){
            arrMerged[idxLeft + idxRight] = arrRight[idxRight];
            idxRight++;
        }

        return arrMerged;
    }

}
