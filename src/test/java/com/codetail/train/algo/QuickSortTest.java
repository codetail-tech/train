package com.codetail.train.algo;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class QuickSortTest {

    @Test
    public void testSort() {
        int[] numbers = {99, 9, 29, 59, 49, 69, 39, 19, 89, 79};

        int[] sortedNumbers = QuickSort.sort(numbers);

        for (int i = 0; i < sortedNumbers.length - 1; i++){
            Assert.assertTrue(sortedNumbers[i] < sortedNumbers[i+1]);
        }
    }

    @Test
    public void testSortedSameNum() {
        int[] numbers = {99, 9, 29, 59, 49, 69, 39, 19, 89, 79, 49, 89, 19};

        int[] sortedNumbers = QuickSort.sort(numbers);

        for (int i = 0; i < sortedNumbers.length - 1; i++){
            Assert.assertTrue(sortedNumbers[i] <= sortedNumbers[i+1]);
        }
    }
}