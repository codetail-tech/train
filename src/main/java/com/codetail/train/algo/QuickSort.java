package com.codetail.train.algo;

import java.util.Arrays;

public class QuickSort {

    public static int[] sort(int[] nums){
        int[] unSortedNumbers = Arrays.copyOf(nums, nums.length);

        qsort(unSortedNumbers, 0, unSortedNumbers.length - 1);

        return unSortedNumbers;
    }

    private static void qsort(int[] unSortedNums, int start, int end){
        if(start < 0 || start >= end){
            return ;
        }

        int i = partion(unSortedNums, start, end);

        qsort(unSortedNums, start, i - 1);
        qsort(unSortedNums, i + 1, end);

    }

    private static int partion(int[] arr, int start, int end){
        int pivot = start;
        int index = pivot + 1;

        for (int i = index; i <= end; i++){
            if(arr[i] >= arr[pivot]){
                continue;
            }
            swapArrayContent(arr, i, index);
            index++;
        }

        swapArrayContent(arr, pivot, index-1);

        return index-1;
    }

    private static void swapArrayContent(int[] arr, int f, int t){
        if(f == t){
            return;
        }
        int tmp = arr[f];
        arr[f] = arr[t];
        arr[t] = tmp;
    }
}
