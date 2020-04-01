package com.codetail.train;

import com.codetail.train.algo.BubbleSort;

public class Train {
    public static void main(String[] args){
        System.out.println("Hello world!");

        int[] numbers = {99, 9, 29, 59, 49, 69, 39, 19, 89, 79};

        int[] sortNumbers = BubbleSort.sort(numbers);

        for(int x : sortNumbers){
            System.out.print(x);
            System.out.print(", ");
        }
    }
}
