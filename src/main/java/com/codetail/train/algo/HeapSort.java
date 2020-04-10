package com.codetail.train.algo;

import java.util.Arrays;

public class HeapSort {

    private static void heapfy(int[] arr, int parent, int heap_size){
        if(parent >= heap_size){
            return;
        }

        int left_child = parent*2 + 1;
        int right_child = left_child + 1;

        if(left_child >= heap_size){
            return;
        }

        int largest_idx = left_child;

        if(right_child < heap_size && arr[right_child] > arr[left_child]){
            largest_idx = right_child;
        }

        if(arr[largest_idx] > arr[parent]){
            swap(arr, parent, largest_idx);
            heapfy(arr, largest_idx, heap_size);
        }

    }

    private static void build_max_heap(int[] arr){
        for(int i = arr.length/2 - 1; i >= 0; i--){
            heapfy(arr, i, arr.length);
        }
    }

    private static void swap(int[] arr, int idx_a, int idx_b){
        int tmp_val = arr[idx_a];
        arr[idx_a] = arr[idx_b];
        arr[idx_b] = tmp_val;
    }

    public static int[] sort(int[] unSortedNums){

        build_max_heap(unSortedNums);

        for(int i = unSortedNums.length-1; i > 0; i--){

            swap(unSortedNums, 0, i);
            heapfy(unSortedNums, 0, i );
        }

        return unSortedNums;
    }
}
