package com.codetail.train.algo;

import org.testng.Assert;

import static org.testng.Assert.*;

public class BubbleSortTest {

    @org.testng.annotations.BeforeMethod
    public void setUp() {
    }

    @org.testng.annotations.AfterMethod
    public void tearDown() {
    }

    @org.testng.annotations.Test
    public void testSort() {

        int[] numbers = {99, 9, 29, 59, 49, 69, 39, 19, 89, 79};

        int[] sortedNumbers = BubbleSort.sort(numbers);

        for (int i = 0; i < sortedNumbers.length - 1; i++){
            Assert.assertTrue(sortedNumbers[i] <= sortedNumbers[i+1]);
        }

    }

    @org.testng.annotations.Test
    public void testSortWithSameNum() {

        int[] numbers = {9, 19, 29, 59, 59, 69, 39, 19, 89, 79};

        int[] sortedNumbers = BubbleSort.sort(numbers);

        for (int i = 0; i < sortedNumbers.length - 1; i++){
            Assert.assertTrue(sortedNumbers[i] <= sortedNumbers[i+1]);
        }

    }
}