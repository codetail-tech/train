package com.codetail.train.algo;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

public class InsertionSortTest {

    @Test
    public void testSort() {


        int[] numbers = {9, 19, 29, 59, 59, 69, 39, 19, 89, 79};

        int[] sortedNumbers = InsertionSort.sort(numbers);

        for (int i = 0; i < sortedNumbers.length - 1; i++){
            Assert.assertTrue(sortedNumbers[i] >= sortedNumbers[i+1]);
        }

    }
}